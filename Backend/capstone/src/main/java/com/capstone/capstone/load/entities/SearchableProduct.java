package com.capstone.capstone.load.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@Document(indexName = "products", createIndex = false)
public class SearchableProduct {

    @Id
    private String id;

    @Field(type = FieldType.Keyword, name = "name")
    private String name;

    @Field(type = FieldType.Date, name = "date")
    private Date date;

    @Field(type = FieldType.Text, name = "description")
    private String description;

    @Field(type = FieldType.Keyword, name = "shop")
    private String shop;

    @Field(type = FieldType.Text, name = "address")
    private String address;

    @Field(type = FieldType.Double, name = "price")
    private double price;

    @Field(type = FieldType.Binary, name = "image")
    private double image;

}