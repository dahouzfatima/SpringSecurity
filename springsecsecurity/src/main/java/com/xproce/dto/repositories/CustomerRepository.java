package com.xproce.dto.repositories;

import com.xproce.dto.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public List<Customer> findByEmail(String email);
}
