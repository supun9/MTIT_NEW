package com.sliit.mtit.microservice.suplorderservice.dto;

public class SupplierCreationRequest {

    private String company_Name;
    private String supplier_Name;
    private String supplier_address;
    private String supplier_phone;
    private String supplier_itemdeteils;

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getSupplier_Name() {
        return supplier_Name;
    }

    public void setSupplier_Name(String supplier_Name) {
        this.supplier_Name = supplier_Name;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public String getSupplier_phone() {
        return supplier_phone;
    }

    public void setSupplier_phone(String supplier_phone) {
        this.supplier_phone = supplier_phone;
    }

    public String getSupplier_itemdeteils() {
        return supplier_itemdeteils;
    }

    public void setSupplier_itemdeteils(String supplier_itemdeteils) {
        this.supplier_itemdeteils = supplier_itemdeteils;
    }


}
