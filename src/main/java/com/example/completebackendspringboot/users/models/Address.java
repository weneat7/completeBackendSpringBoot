package com.example.completebackendspringboot.users.models;

import com.example.completebackendspringboot.product.models.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address extends BaseModel {
            private String  city;
            private String  street;
            private Long  number;
            private String zipcode;
            @OneToOne
            private GeoLocation geolocation;
}
