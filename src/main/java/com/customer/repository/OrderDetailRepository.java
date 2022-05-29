package com.customer.repository;

import java.util.List;
import java.util.Optional;

import com.customer.domain.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
    public Optional<OrderDetail> findById(Integer id);

    public List<OrderDetail> findByUser_Id(Integer userId);
}
