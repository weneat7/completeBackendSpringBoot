package com.example.completebackendspringboot.users.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.completebackendspringboot.users.models.Address}
 */
@Getter
@Setter
public class AddressDto implements Serializable {
    @JsonProperty("city")
    String city;
    @JsonProperty("street")
    String street;
    @JsonProperty("number")
    Long number;
    @JsonProperty("zipcode")
    String zipcode;
    @JsonProperty("geolocation")
    GeoLocationDto geolocation;

}