package com.customer.repository;

import com.customer.domain.RentalAgreement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalAgreementRepository extends JpaRepository<RentalAgreement, Integer> {

}
