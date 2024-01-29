package com.example.completebackendspringboot.users.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.completebackendspringboot.users.models.User}
 */
@Getter
@Setter
public class UserDto implements Serializable {
    @JsonProperty("id")
    Long id;

    @JsonProperty("email")
    String email;

    @JsonProperty("username")
    String userName;

    @JsonProperty("password")
    String password;

    @JsonProperty("name")
    NameDto name;

    @JsonProperty("address")
    AddressDto address;

    @JsonProperty("phone")
    String phone;

}