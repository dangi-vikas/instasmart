package com.customer.controller;

import com.customer.domain.*;
import com.customer.exception.NotFoundException;
import com.customer.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/obtainProductList")
	public List<Product> obtainProductList() {
		return productService.obtainProductList();
	}
	
	@GetMapping("/obtainProductById")
	public Product obtainProductById(@PathVariable("id") Integer id) throws NotFoundException {
		return productService.obtainProductById(id);
	}

	@GetMapping("/addProductToMyCart/productList")
	public OrderDetail addProductToMyCart(@PathVariable("productList") String productList) {
		return productService.addProductToMyCart(productList);
	}
}
