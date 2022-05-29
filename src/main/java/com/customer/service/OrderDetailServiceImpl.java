package com.customer.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import com.customer.domain.Address;
import com.customer.domain.OrderDetail;
import com.customer.domain.RentalAgreement;
import com.customer.repository.AddressRepository;
import com.customer.repository.OrderDetailRepository;
import com.customer.repository.RentalAgreementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    RentalAgreementRepository rentalAgreementRepository;

    @Override
    public OrderDetail obtainOrderDetailById(Integer id) {
        return orderDetailRepository.findById(id).get();
    }

    @Override
    public List<Address> obtainAddressList(Integer userId) {
        return (List<Address>) orderDetailRepository.findByUser_Id(userId).stream().map(x -> x.getAddress());
    }

    @Override
    public Address obtainAddressById(Integer addressId) {
        return addressRepository.findById(addressId).get();
    }

    @Override
    public OrderDetail saveAddressAndCalculatePrice(Integer orderDetailId, Integer addressId, Integer discountId) {
        Address address = addressRepository.findById(addressId).get();
        orderDetailRepository.findById(orderDetailId).get().setAddress(address);
        orderDetailRepository.save();

        rentalAgreementRepository.save();

        return new OrderDetail();
    }

}
