package com.customer.repository;

import com.customer.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    public void save();
    public OrderDetail findByUser_Id(Integer userId);
}
