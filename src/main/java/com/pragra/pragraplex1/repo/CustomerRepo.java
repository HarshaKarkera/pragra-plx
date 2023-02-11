package com.pragra.pragraplex1.repo;

import com.pragra.pragraplex1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>
{
    List<Customer> getByLastName(String lastName);
}
