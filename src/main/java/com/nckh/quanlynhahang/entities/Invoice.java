package com.nckh.quanlynhahang.entities;

import javax.persistence.*;

@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "invoice_time")
    private String invoiceTime;

    @ManyToOne
    @JoinColumn(name = "id_employee", nullable = false)
    private User user;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(String invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
