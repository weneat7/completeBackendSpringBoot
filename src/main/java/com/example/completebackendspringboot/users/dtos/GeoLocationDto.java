package com.example.completebackendspringboot.users.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.example.completebackendspringboot.users.models.GeoLocation}
 */
@Getter
@Setter
public class GeoLocationDto implements Serializable {
    @JsonProperty("lat")
    String lat;
    @JsonProperty("long")
    String lng;
}