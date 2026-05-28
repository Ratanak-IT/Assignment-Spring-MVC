package org.example.part3mvc.repository;

import org.example.part3mvc.domain.Coffee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {

    public List<Coffee> beanCoffee(){
        Coffee coffee1 = new Coffee("c1", "Cappuccino", "Kafe drinking", 1.5);
        Coffee coffee2 = new Coffee("c2", "Americano", "Kafe drinking", 2.5);
        Coffee coffee3 = new Coffee("c3", "Beka", "Kafe drinking", 2.5);
        return Arrays.asList(coffee1, coffee2, coffee3);
    }
}
