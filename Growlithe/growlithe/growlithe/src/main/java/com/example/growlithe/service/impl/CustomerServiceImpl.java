package com.example.growlithe.service.impl;

import com.example.growlithe.domain.Customer;
import com.example.growlithe.repository.CustomerRepository;
import com.example.growlithe.service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer getById(long id) {
        return this.customerRepository.getCustomerById(id);
    }
}
