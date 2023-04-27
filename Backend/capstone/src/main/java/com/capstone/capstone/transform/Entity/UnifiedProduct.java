package com.capstone.capstone.transform.Entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import org.hibernate.annotations.Columns;
@JsonPropertyOrder({ "address","date","itemDesc", "itemLink","itemName", "itemImage","itemPrice","itemQuantity","itemWeight","shopName"})
@Entity
@Table(name="product")

public class UnifiedProduct {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "article_link")
    private String article_link;
    @Column(name = "date_expires")
    private String date_expires;
    @Column(name = "date_published")
    private String date_published;
    @Column(name = "description")
    private String description;
    @Column(name = "extra_details")
    private String extra_details;
    @Column(name = "img_link")
    private String img_link;
    @Column(name = "price")
    private String price;
    @Column(name = "scraped_date")
    private String scraped_date;
    @Column(name = "store_location")
    private String store_location;
    @Column(name = "title")
    private String title;
    @Column(name = "weight")
    private String weight;


    //constructor
    public UnifiedProduct(Integer id, String article_link, String date_expires, String date_published, String description, String extra_details, String img_link, String price, String scraped_date, String store_location, String title, String weight) {
        this.id = id;
        this.article_link = article_link;
        this.date_expires = date_expires;
        this.date_published = date_published;
        this.description = description;
        this.extra_details = extra_details;
        this.img_link = img_link;
        this.price = price;
        this.scraped_date = scraped_date;
        this.store_location = store_location;
        this.title = title;
        this.weight = weight;
    }

    public UnifiedProduct() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticle_link() {
        return article_link;
    }

    public void setArticle_link(String article_link) {
        this.article_link = article_link;
    }

    public String getDate_expires() {
        return date_expires;
    }

    public void setDate_expires(String date_expires) {
        this.date_expires = date_expires;
    }

    public String getDate_published() {
        return date_published;
    }

    public void setDate_published(String date_published) {
        this.date_published = date_published;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtra_details() {
        return extra_details;
    }

    public void setExtra_details(String extra_details) {
        this.extra_details = extra_details;
    }

    public String getImg_link() {
        return img_link;
    }

    public void setImg_link(String img_link) {
        this.img_link = img_link;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getScraped_date() {
        return scraped_date;
    }

    public void setScraped_date(String scraped_date) {
        this.scraped_date = scraped_date;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "UnifiedProduct{" +
                "id=" + id +
                ", article_link='" + article_link + '\'' +
                ", date_expires='" + date_expires + '\'' +
                ", date_published='" + date_published + '\'' +
                ", description='" + description + '\'' +
                ", extra_details='" + extra_details + '\'' +
                ", img_link='" + img_link + '\'' +
                ", price='" + price + '\'' +
                ", scraped_date='" + scraped_date + '\'' +
                ", store_location='" + store_location + '\'' +
                ", title='" + title + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
