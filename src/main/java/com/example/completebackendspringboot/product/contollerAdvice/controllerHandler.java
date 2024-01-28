package com.example.completebackendspringboot.product.contollerAdvice;

import com.example.completebackendspringboot.product.dtos.ProductNotFountDto;
import com.example.completebackendspringboot.product.exceptions.ProductNotExistException;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class controllerHandler {

    @ExceptionHandler(ProductNotExistException.class)
    ResponseEntity<ProductNotFountDto> productNotExistExceptionHandle(){
        return new ResponseEntity<>(new ProductNotFountDto("ProductNotFound"), HttpStatus.OK);
    }


}
