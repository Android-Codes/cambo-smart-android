package com.nanita.cambosmart.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chhaichivon on 4/26/17.
 */

public class Products  implements Serializable{

    @SerializedName("_id")
    private int id;
    @SerializedName("productName")
    private String productName;
    @SerializedName("productDescription")
    private String productDescription;
    @SerializedName("productImage")
    private List<ProductImage> productImage;
    @SerializedName("price")
    private float price;
    @SerializedName("discount")
    private double discount;
    @SerializedName("discountFromDate")
    private String discountFromDate;
    @SerializedName("discountEndDate")
    private String discountEndDate;
    @SerializedName("productType")
    private String productType;
    @SerializedName("createDate")
    private String createDate;
    @SerializedName("expireDate")
    private String expireDate;
    @SerializedName("status")
    private int status;
    @SerializedName("blockDate")
    private String blockDate;

    public Products(int id, String productName, String productDescription, List<ProductImage> productImage, float price, double discount, String discountFromDate, String discountEndDate, String productType, String createDate, String expireDate, int status, String blockDate) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.price = price;
        this.discount = discount;
        this.discountFromDate = discountFromDate;
        this.discountEndDate = discountEndDate;
        this.productType = productType;
        this.createDate = createDate;
        this.expireDate = expireDate;
        this.status = status;
        this.blockDate = blockDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public List<ProductImage> getProductImage() {
        return productImage;
    }

    public void setProductImage(List<ProductImage> productImage) {
        this.productImage = productImage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDiscountFromDate() {
        return discountFromDate;
    }

    public void setDiscountFromDate(String discountFromDate) {
        this.discountFromDate = discountFromDate;
    }

    public String getDiscountEndDate() {
        return discountEndDate;
    }

    public void setDiscountEndDate(String discountEndDate) {
        this.discountEndDate = discountEndDate;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBlockDate() {
        return blockDate;
    }

    public void setBlockDate(String blockDate) {
        this.blockDate = blockDate;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", productImage=" + productImage +
                ", price=" + price +
                ", discount=" + discount +
                ", discountFromDate='" + discountFromDate + '\'' +
                ", discountEndDate='" + discountEndDate + '\'' +
                ", productType='" + productType + '\'' +
                ", createDate='" + createDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", status=" + status +
                ", blockDate='" + blockDate + '\'' +
                '}';
    }
}
