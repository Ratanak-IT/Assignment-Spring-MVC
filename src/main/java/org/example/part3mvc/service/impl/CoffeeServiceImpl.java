package org.example.part3mvc.service.impl;

import org.example.part3mvc.domain.Coffee;
import org.example.part3mvc.dto.response.CaffeeReaponse;
import org.example.part3mvc.mapping.CoffeeMapper;
import org.example.part3mvc.repository.CoffeeRepository;
import org.example.part3mvc.service.CoffeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;
    private final CoffeeMapper coffeeMapper;

    public CoffeeServiceImpl(CoffeeRepository coffeeRepository, CoffeeMapper coffeeMapper) {
        this.coffeeRepository = coffeeRepository;
        this.coffeeMapper = coffeeMapper;
    }
    @Override
    public List<CaffeeReaponse> getAllCoffee() {
        List<Coffee> coffeeList = coffeeRepository.beanCoffee();
//        return coffeeList.stream().filter(coffee -> coffee.getCode().equals("C2")).toList();
        return coffeeMapper.toCoffeeResponse(coffeeList);
    }
}
