package com.customer.service;

import java.util.List;

import com.customer.domain.OrderDetail;
import com.customer.domain.Product;

public interface ProductService {
    public List<Product> obtainProductList();
    public Product obtainProductById(Integer id);
    public OrderDetail addProductToMyCart(String productList);
}
