package org.example.part3mvc.service;

import org.example.part3mvc.dto.response.CaffeeResponse;

import java.util.List;

public interface CoffeeService {
    List<CaffeeResponse> getAllCoffee();
    CaffeeResponse getCoffeeById(String code);
    List<CaffeeResponse> getCoffeeByName(String name, Double price);
}
