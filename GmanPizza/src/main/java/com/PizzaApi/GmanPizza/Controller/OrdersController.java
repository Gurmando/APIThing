package com.PizzaApi.GmanPizza.Controller;


import com.PizzaApi.GmanPizza.Services.OrderService;
import com.PizzaApi.GmanPizza.models.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @Autowired
    private OrderService ordersService;

    @PostMapping("/customers/{customerId}/orders")
    public ResponseEntity<Void> createOrder(@PathVariable Long customerId, @RequestBody Orders order){
        ordersService.addOrder(customerId, order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
