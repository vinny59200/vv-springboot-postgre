package com.vv.testcontainerpostgres.customer.repository;

import com.vv.testcontainerpostgres.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByName( String name );

    List<Customer> findAll();

}