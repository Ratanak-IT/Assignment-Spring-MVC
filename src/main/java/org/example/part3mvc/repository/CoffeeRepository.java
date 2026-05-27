package org.example.part3mvc.repository;

import org.example.part3mvc.domain.Coffee;
import org.example.part3mvc.dto.response.CaffeeReaponse;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CoffeeRepository {

    public List<Coffee> beanCoffee(){
        Coffee coffee1 = new Coffee("C1", "Cappuccino", "Kafe drinking");
        Coffee coffee2 = new Coffee("C2", "Americano", "Kafe drinking");
        Coffee coffee3 = new Coffee("C3", "Beka", "Kafe drinking");
        return Arrays.asList(coffee1, coffee2, coffee3);
    }
}
