package com.oreilly.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Invoice {
    private Long customerId;
    private @Id Long invoiceId;
    private String invoiceData;

    Invoice() {}
    public Invoice(Long customerId, Long invoiceId, String invoiceData) {
        this.customerId = customerId;
        this.invoiceId = invoiceId;
        this.invoiceData = invoiceData;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceData() {
        return this.invoiceData;
    }

    public void setInvoiceData(String invoiceData) {
        this.invoiceData = invoiceData;
    }


}
