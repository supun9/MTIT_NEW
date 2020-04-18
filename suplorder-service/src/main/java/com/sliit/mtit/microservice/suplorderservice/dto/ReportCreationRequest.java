package com.sliit.mtit.microservice.suplorderservice.dto;

public class ReportCreationRequest {

    private String company_Name;
    private String suppplier_Name;
    private String suppplier_address;
    private String suppplier_phone;
    private String company_phone;
    private String item_deteils;
    private String order_date;
    private String qty;

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getSuppplier_Name() {
        return suppplier_Name;
    }

    public void setSuppplier_Name(String suppplier_Name) {
        this.suppplier_Name = suppplier_Name;
    }

    public String getSuppplier_address() {
        return suppplier_address;
    }

    public void setSuppplier_address(String suppplier_address) {
        this.suppplier_address = suppplier_address;
    }

    public String getSuppplier_phone() {
        return suppplier_phone;
    }

    public void setSuppplier_phone(String suppplier_phone) {
        this.suppplier_phone = suppplier_phone;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getItem_deteils() {
        return item_deteils;
    }

    public void setItem_deteils(String item_deteils) {
        this.item_deteils = item_deteils;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }


}
