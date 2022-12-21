package com.dehaanido.webclienttracker2.repos;

import com.dehaanido.webclienttracker2.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public List<Customer> findAllByOrderByLastNameAsc();
}
