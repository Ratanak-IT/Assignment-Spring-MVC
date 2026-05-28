package org.example.part3mvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.part3mvc.dto.response.CaffeeResponse;
import org.example.part3mvc.service.CoffeeService;
import org.example.part3mvc.service.impl.CoffeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/coffees")
@Slf4j
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController (CoffeeServiceImpl coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<CaffeeResponse> getAllCoffee(){
        return coffeeService.getAllCoffee();
    }

    @GetMapping("/{code}")
    public CaffeeResponse getCoffeeById(@PathVariable String code){
        log.info("Coffee id: {}", code);
        return coffeeService.getCoffeeById(code);
    }

    @GetMapping("/search")
    public List<CaffeeResponse> getCoffeeByName(@RequestParam String name){
        log.info("Coffee name: {}", name);
        return coffeeService.getCoffeeByName(name);

    }
}
