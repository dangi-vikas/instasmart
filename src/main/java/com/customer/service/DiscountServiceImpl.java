package com.customer.service;

import java.util.List;

import com.customer.domain.Discount;
import com.customer.repository.DiscountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountRepository discountRepository;

    @Override
    public List<Discount> getDiscounts() {
        return discountRepository.findAll();
    }

}
