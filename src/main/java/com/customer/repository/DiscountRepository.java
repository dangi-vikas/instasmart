package com.customer.repository;

import java.util.Optional;
import java.util.List;

import com.customer.domain.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    public Optional<Discount> findById(Integer discountId);
    public List<Discount> findAll();
}
