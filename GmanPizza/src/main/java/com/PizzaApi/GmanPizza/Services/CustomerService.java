package com.PizzaApi.GmanPizza.Services;

import com.PizzaApi.GmanPizza.Repository.CustomerRepo;
import com.PizzaApi.GmanPizza.models.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepo customerRepo;

    public void addCustomer(Customers customers){
        customerRepo.save(customers);
    }

    public Iterable<Customers> getAllCustomers(){
        return customerRepo.findAll();
    }

    public Optional<Customers> getCustomerById(Long id){
        return customerRepo.findById(id);
    }

    public void updateCustomer(Long id, Customers customers){
        customers.setId(id);
        customerRepo.save(customers);
    }

    public void deleteCustomer(Long id){
        customerRepo.deleteById(id);
    }
}
