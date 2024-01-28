package com.example.completebackendspringboot.product.exceptions;

public class ProductNotExistException extends RuntimeException{
    public ProductNotExistException(String message) {
        super(message);
    }
}
