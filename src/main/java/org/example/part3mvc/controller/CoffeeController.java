package org.example.part3mvc.controller;

import org.example.part3mvc.dto.response.CaffeeReaponse;
import org.example.part3mvc.mapping.CoffeeMapper;
import org.example.part3mvc.service.CoffeeService;
import org.example.part3mvc.service.impl.CoffeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/coffees")
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController (CoffeeServiceImpl coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<CaffeeReaponse> getAllCoffee(){
        return coffeeService.getAllCoffee();
    }
}
