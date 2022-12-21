package com.dehaanido.webclienttracker2.service;

import com.dehaanido.webclienttracker2.entity.Customer;
import com.dehaanido.webclienttracker2.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repo;

    public Customer getCustomer(int id) {
        return repo.findById(id).get();
    }

    public List<Customer> getCustomers() {
        List<Customer> list = new ArrayList<>();
        for(Customer c : repo.findAllByOrderByLastNameAsc()) {
            list.add(c);
        }
        return list;
    }

    public void saveCustomer(Customer customer) {
        repo.save(customer);
    }

    public void deleteCustomer(int id) {
        repo.deleteById(id);
    }
}
