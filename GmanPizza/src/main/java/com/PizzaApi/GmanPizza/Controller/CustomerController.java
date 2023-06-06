package com.PizzaApi.GmanPizza.Controller;

import com.PizzaApi.GmanPizza.Services.CustomerService;
import com.PizzaApi.GmanPizza.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public ResponseEntity<Void> createCustomer(@RequestBody Customers customers){
        customerService.addCustomer(customers);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

@GetMapping("/customers")
    public ResponseEntity<Void> getCustomers(){
    customerService.getAllCustomers();
    return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<Void> updateCustomer(@PathVariable Long id, @RequestBody Customers customers){
        customerService.updateCustomer(id, customers);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/customers/{id}")
    public Optional<Customers> getCustomersByID(Long id){
       return customerService.getCustomerById(id);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(Long id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
