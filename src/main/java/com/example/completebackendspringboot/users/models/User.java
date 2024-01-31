package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String email;
    private String userName;
    private String password;
    @ManyToOne
    private Name name;
    @ManyToOne
    private Address address;
    private String phone;
}
