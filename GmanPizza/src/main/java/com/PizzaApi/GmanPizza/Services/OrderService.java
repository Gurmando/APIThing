package com.PizzaApi.GmanPizza.Services;

import com.PizzaApi.GmanPizza.Repository.CustomerRepo;
import com.PizzaApi.GmanPizza.Repository.OrdersRepo;
import com.PizzaApi.GmanPizza.models.Customers;
import com.PizzaApi.GmanPizza.models.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private OrdersRepo ordersRepo;

    public void addOrder(Long customerId, Orders orders){

        Customers Customer = customerRepo.findById(customerId).orElse(null);

        orders.setCustomers(customer);

        orders.save();

    }
}
