package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address extends BaseModel {
            private String  city;
            private String  street;
            private Long  number;
            private String zipcode;
            private GeoLocation geolocation;
}
