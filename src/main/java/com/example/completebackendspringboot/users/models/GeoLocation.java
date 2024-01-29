package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GeoLocation extends BaseModel {
    private String lat;
    private String lng;
}
