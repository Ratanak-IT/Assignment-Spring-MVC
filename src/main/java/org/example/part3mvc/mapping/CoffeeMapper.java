package org.example.part3mvc.mapping;

import org.example.part3mvc.domain.Coffee;
import org.example.part3mvc.dto.response.CaffeeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {

    List<CaffeeResponse> toCoffeeResponse(List<Coffee> coffee);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    CaffeeResponse toCoffeeResponse(Coffee coffee);

}
