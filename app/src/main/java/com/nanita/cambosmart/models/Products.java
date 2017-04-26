package com.nanita.cambosmart.models;

import java.io.Serializable;

/**
 * Created by chhaichivon on 4/26/17.
 */

public class Products  implements Serializable{
    private int id;
    private String name;
    private float price;
    private String description;
    private String date;
    private int liked;

    public Products(int id, String name, float price, String description, String date, int liked) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.date = date;
        this.liked = liked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }
}
