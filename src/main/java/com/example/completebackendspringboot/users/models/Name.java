package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Name extends BaseModel{
    private String firstName;
    private String lastName;
}
