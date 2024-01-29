package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel {
    private String email;
    private String userName;
    private String password;
    private Name name;
    private Address address;
    private String phone;
}
