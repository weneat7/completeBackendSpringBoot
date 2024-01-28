package com.example.completebackendspringboot.product.models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Product extends BaseModel
{
    private String title;
    private Long price;
    @ManyToOne
    private Category category;
    private String description;
    private String imageUrl;

}
    /*
    id:1,
    title:'...',
    price:'...',
    category:'...',
    description:'...',
    image:'...'
}
*/