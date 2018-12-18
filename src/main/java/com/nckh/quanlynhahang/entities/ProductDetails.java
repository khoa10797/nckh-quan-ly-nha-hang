package com.nckh.quanlynhahang.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_details")
public class ProductDetails {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private String price;

    @Column(name = "picture")
    private String picture;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "productDetails")
    private Set<InvoiceDetails> invoiceDetails;




    public Set<InvoiceDetails> getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(Set<InvoiceDetails> invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
