package org.example.part3mvc.service;

import org.example.part3mvc.domain.Coffee;
import org.example.part3mvc.dto.response.CaffeeReaponse;

import java.util.List;

public interface CoffeeService {
    List<CaffeeReaponse> getAllCoffee();
}
