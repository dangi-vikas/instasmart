package com.customer.service;

import java.util.List;

import com.customer.domain.Address;
import com.customer.domain.OrderDetail;

import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

    @Override
    public OrderDetail obtainOrderDetailById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Address> obtainAddressList(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Address obtainAddressById(Integer addressId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OrderDetail saveAddressAndCalculatePrice(Integer orderDetailId, Integer addressId, Integer discountId) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
