package com.customer.controller;

import com.customer.domain.Discount;
import com.customer.service.DiscountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class DiscountController {

    @Autowired
    DiscountService discountService;

    @GetMapping("/getDiscount")
    public List<Discount> getDiscounts() {
        return discountService.getDiscounts();
    }
			
}