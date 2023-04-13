package com.capstone.capstone.load.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "products")
public class SearchableProduct {

    @Id
    private String id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "description")
    private String description;

    @Field(type = FieldType.Text, name = "shop")
    private String shop;

    @Field(type = FieldType.Text, name = "address")
    private String address;

    @Field(type = FieldType.Double, name = "price")
    private double price;

    @Field(type = FieldType.Binary, name = "image")
    private double image;


    // Getter and Setter
}