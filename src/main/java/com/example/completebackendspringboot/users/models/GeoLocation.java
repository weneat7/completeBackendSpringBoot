package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class GeoLocation extends BaseModel {
    private String lat;
    private String lng;
}
