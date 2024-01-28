package com.example.completebackendspringboot.product.dtos;

public class ProductNotFountDto {
    private String message;

    public ProductNotFountDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
