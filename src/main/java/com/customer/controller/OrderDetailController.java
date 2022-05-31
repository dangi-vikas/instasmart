package com.customer.controller;

import com.customer.domain.*;
import com.customer.service.OrderDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class OrderDetailController {

	@Autowired
	OrderDetailService orderDetailService;

	@GetMapping("/obtainDiscountList/{id}")
	public OrderDetail obtainOrderDetailById(@PathVariable("id") Integer id) {
		return orderDetailService.obtainOrderDetailById(id);
	}

	@GetMapping("/obtainAddressList/{userId}")
	public List<Address> obtainAddressList(@PathVariable("userId") Integer userId) {
		return orderDetailService.obtainAddressList(userId);
	}

	@GetMapping("/obtainAddressById/{addressId}")
	public Address obtainAddressById(@PathVariable("addressId") Integer addressId) {
		return orderDetailService.obtainAddressById(addressId);
	}

	@GetMapping("/setAddressForOrderDetail/{orderDetailId}/{addressId}/{discountId}")
	public OrderDetail saveAddressAndCalculatePrice(@PathVariable("orderDetailId") Integer orderDetailId,
			@PathVariable("addressId") Integer addressId,
			@PathVariable("discountId") Integer discountId) {

		return orderDetailService.saveAddressAndCalculatePrice(orderDetailId, addressId, discountId);
	}
}
