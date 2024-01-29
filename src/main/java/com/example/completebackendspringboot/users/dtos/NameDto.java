package com.example.completebackendspringboot.users.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.completebackendspringboot.users.models.Name}
 */
@Getter
@Setter
public class NameDto implements Serializable {
    @JsonProperty("firstname")
    String firstName;
    @JsonProperty("lastname")
    String lastName;
}