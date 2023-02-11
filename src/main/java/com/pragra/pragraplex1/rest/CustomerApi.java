package com.pragra.pragraplex1.rest;

import com.pragra.pragraplex1.entity.Customer;
import com.pragra.pragraplex1.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerApi
{
    private CustomerService customerService;

    public CustomerApi(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer)
    {
        customer.setCreateDate(new Date());
        customer.setUpdateDate(new Date());
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customer")
    public List<Customer> geAllCustomers(@RequestParam(name="lastName",required = false,defaultValue ="abc") String lastName)
    {
        if(lastName.equals("abc")) {
            return customerService.getAllCustomer();
        }
        return customerService.getByLastName(lastName);
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getByID(@PathVariable Integer id)
    {
        return customerService.getCustomerId(id);
    }
    @PostMapping("/customers")
    public List<Customer> createAll(@RequestBody List<Customer> customers )
    {

        return customerService.createAllCustomer(customers);
    }


}
