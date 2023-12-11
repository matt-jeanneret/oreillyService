package com.oreilly.demo;

public class TenderDetails {

    private double amount;
    private TenderType tenderType;

    public TenderDetails(double amount, TenderType tenderType) {
        this.amount = amount;
        this.tenderType = tenderType;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TenderType getTenderType() {
        return this.tenderType;
    }

    public void setTenderType(TenderType tenderType) {
        this.tenderType = tenderType;
    }

}
