package com.customer.repository;

import com.customer.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
    public Optional<Address> findById(Integer addressId);
}
