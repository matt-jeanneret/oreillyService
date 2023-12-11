package com.oreilly.demo;

public class InvoiceData {
    private String timeOfDay;
    private TenderDetails tenderDetails;

    public InvoiceData(String timeOfDay, TenderDetails tenderDetails) {
        this.timeOfDay = timeOfDay;
        this.tenderDetails = tenderDetails;
    }

    public String getTimeOfDay() {
        return this.timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public TenderDetails getTenderDetails() {
        return this.tenderDetails;
    }

    public void setTenderDetails(TenderDetails tenderDetails) {
        this.tenderDetails = tenderDetails;
    }

}