package org.example.part3mvc.mapping;

import org.example.part3mvc.domain.Coffee;
import org.example.part3mvc.dto.response.CaffeeReaponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    List<CaffeeReaponse> toCoffeeResponse(List<Coffee> coffee);
}
