package com.edu.tdm.service;

import com.edu.tdm.dao.CustomerDAO;
import com.edu.tdm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public void saveCustomer(Customer customer) {
        customerDAO.save(customer);
    }

    @Transactional
    public List<Customer> getAllCustomers() {
        return customerDAO.getAll();
    }

    @Transactional
    public Customer getCustomerById(Long id) {
        return customerDAO.getById(id);
    }

    @Transactional
    public void deleteCustomer(Long id) {
        customerDAO.delete(id);
    }
}
