package com.pragra.pragraplex1.service;

import com.pragra.pragraplex1.Exception.CustomerNotValidException;
import com.pragra.pragraplex1.entity.Customer;
import com.pragra.pragraplex1.repo.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepo repo;

    public CustomerServiceImpl(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public Customer createCustomer(Customer customer)
    {
        if(customer.getLogin()==null)
        {
            throw new CustomerNotValidException(String.format("Customer with id {} is invalid as login is null",customer.getId()));
        }
        return repo.save(customer);
    }

    @Override
    public List<Customer> createAllCustomer(List<Customer> customers) {
        return repo.saveAll(customers);
    }

    @Override
    public Optional<Customer> getCustomerId(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }

    @Override
    public List<Customer> getByLastName(String lastName) {
        return repo.getByLastName(lastName);
    }
}
