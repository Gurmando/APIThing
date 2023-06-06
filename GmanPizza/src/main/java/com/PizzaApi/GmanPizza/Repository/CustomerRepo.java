package com.PizzaApi.GmanPizza.Repository;

import com.PizzaApi.GmanPizza.models.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customers, Long> {
}
