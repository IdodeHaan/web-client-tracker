package com.dehaanido.webclienttracker2;

import com.dehaanido.webclienttracker2.entity.Customer;
import com.dehaanido.webclienttracker2.repos.CustomerRepository;
import com.dehaanido.webclienttracker2.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebClientTracker2ApplicationTests {

    @Autowired
    CustomerRepository repo;

    @Autowired
    CustomerService service;

    @Test
    void contextLoads() {
    }

    @Test
    public void createTest() {
        Customer customer = new Customer();
        customer.setFirstName("Jan");
        customer.setLastName("Jansen");
        customer.setEmail("jan@gmail.com");
        repo.save(customer);
    }

    @Test
    public void getTest() {
        Customer customer = repo.findById(6).get();
        System.out.println(customer);
    }

    @Test
    public void getAllTest() {
        System.out.println(service.getCustomers());
    }

}
