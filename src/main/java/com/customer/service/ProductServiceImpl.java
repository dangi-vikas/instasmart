package com.customer.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.customer.domain.OrderDetail;
import com.customer.domain.Product;
import com.customer.exception.NotFoundException;
import com.customer.repository.OrderDetailRepository;
import com.customer.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public List<Product> obtainProductList() {
        return productRepository.findAll();
    }

    @Override
    public Product obtainProductById(Integer id) {
        Product product = null;

        try {
            product = productRepository.findById(id).orElseThrow(() -> new NotFoundException("Product not found!!"));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return product;
    }

    @Override
    public OrderDetail addProductToMyCart(String productList) {
        ArrayList<String> idList = new ArrayList<>(Arrays.asList(productList.split(",")));
        ArrayList<Product> prodList = new ArrayList<>();
        OrderDetail order = new OrderDetail();

        for (String id : idList) {
            Product product = productRepository.findById(Integer.parseInt(id)).get();
            prodList.add(product);
        }

        order.setProductList(prodList);
        orderDetailRepository.save(order);

        return order;
    }

}
