package com.nckh.quanlynhahang.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    private ProductCategory productCategory;

    @Column(name = "quantity_buy")
    private int quantityBuy;

    @OneToMany(mappedBy = "product")
    private Set<ProductDetails> productDetails;




    public int getQuantityBuy() {
        return quantityBuy;
    }

    public void setQuantityBuy(int quantityBuy) {
        this.quantityBuy = quantityBuy;
    }

    public Set<ProductDetails> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(Set<ProductDetails> productDetails) {
        this.productDetails = productDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
