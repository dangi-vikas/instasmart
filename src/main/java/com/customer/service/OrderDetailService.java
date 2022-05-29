package com.customer.service;

import java.util.List;

import com.customer.domain.Address;
import com.customer.domain.OrderDetail;

public interface OrderDetailService {
    public OrderDetail obtainOrderDetailById(Integer id);
	public List<Address> obtainAddressList(Integer userId);
	public Address obtainAddressById(Integer addressId);
	public OrderDetail saveAddressAndCalculatePrice(Integer orderDetailId,Integer addressId, Integer discountId);
	
}
