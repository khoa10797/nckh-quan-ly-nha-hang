package com.nckh.quanlynhahang.entities;

import javax.persistence.*;

@Entity
@Table(name = "invoice_details")
public class InvoiceDetails {

    @EmbeddedId
    private InvoiceDetailsId id;

    @Column(name = "quantity")
    private double quantity;

    public InvoiceDetailsId getId() {
        return id;
    }

    public void setId(InvoiceDetailsId id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
