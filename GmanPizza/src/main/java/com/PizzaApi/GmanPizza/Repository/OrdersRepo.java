package com.PizzaApi.GmanPizza.Repository;

import com.PizzaApi.GmanPizza.models.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepo extends CrudRepository<Orders, Long> {
}
