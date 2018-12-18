package com.nckh.quanlynhahang.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "invoice_details")
public class InvoiceDetails {

    @EmbeddedId
    private InvoiceDetailsId id;

    @ManyToOne
    @MapsId("invoiceId")
    private Invoice invoice;

    @ManyToOne
    @MapsId("productDetailsId")
    private ProductDetails productDetails;

    @Column(name = "quantity")
    private double quantity;




    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

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



    @Embeddable
    public class InvoiceDetailsId implements Serializable {

        @Column(name = "id_invoice", nullable = false)
        private String invoiceId;

        @Column(name = "id_product_details", nullable = false)
        private String productDetailsId;


        public String getInvoiceId() {
            return invoiceId;
        }

        public void setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
        }

        public String getProductDetailsId() {
            return productDetailsId;
        }

        public void setProductDetailsId(String productDetailsId) {
            this.productDetailsId = productDetailsId;
        }
    }
}
