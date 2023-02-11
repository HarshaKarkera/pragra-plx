package com.pragra.pragraplex1.service;

import com.pragra.pragraplex1.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService
{
    Customer  createCustomer(Customer customer);

    List<Customer> createAllCustomer(List<Customer> customers);

    Optional<Customer> getCustomerId(Integer id);

    List<Customer> getAllCustomer();

    List<Customer> getByLastName(String lastName);
}
