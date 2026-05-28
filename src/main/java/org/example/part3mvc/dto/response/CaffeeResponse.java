package org.example.part3mvc.dto.response;

    public record CaffeeResponse(
            String name,
            String description,
            Double price
    ) {
    }
