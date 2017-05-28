package com.nanita.cambosmart.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by chhaichivon on 5/3/17.
 */

public class ProductsResponse {
    @SerializedName("id")
    private int id;
    @SerializedName("product")
    private List<Products> products;
    @SerializedName("total")
    private int total;

    public ProductsResponse(int id, List<Products> products, int total) {
        this.id = id;
        this.products = products;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
