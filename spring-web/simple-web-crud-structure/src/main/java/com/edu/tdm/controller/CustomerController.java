package com.edu.tdm.controller;

import com.edu.tdm.entity.Customer;
import com.edu.tdm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customers/list";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("customerId") Long id, Model model) {
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") Long id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers/list";
    }
}
