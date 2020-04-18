package com.sliit.mtit.microservice.suplorderservice.dto;

public class SupOrderRequest {

    private String order_company_Name;
    private String order_supplier_Name;
    private String order_Deti;
    private String order_company_address;
    private String order_company_phone;
    private String order_suppplier_phone;
    private String order_Item_deteils;
    private String order_qty;
    private String order_date;

    public String getOrder_company_Name() {
        return order_company_Name;
    }

    public void setOrder_company_Name(String order_company_Name) {
        this.order_company_Name = order_company_Name;
    }

    public String getOrder_supplier_Name() {
        return order_supplier_Name;
    }

    public void setOrder_supplier_Name(String order_supplier_Name) {
        this.order_supplier_Name = order_supplier_Name;
    }

    public String getOrder_Deti() {
        return order_Deti;
    }

    public void setOrder_Deti(String order_Deti) {
        this.order_Deti = order_Deti;
    }

    public String getOrder_company_address() {
        return order_company_address;
    }

    public void setOrder_company_address(String order_company_address) {
        this.order_company_address = order_company_address;
    }

    public String getOrder_company_phone() {
        return order_company_phone;
    }

    public void setOrder_company_phone(String order_company_phone) {
        this.order_company_phone = order_company_phone;
    }

    public String getOrder_suppplier_phone() {
        return order_suppplier_phone;
    }

    public void setOrder_suppplier_phone(String order_suppplier_phone) {
        this.order_suppplier_phone = order_suppplier_phone;
    }

    public String getOrder_Item_deteils() {
        return order_Item_deteils;
    }

    public void setOrder_Item_deteils(String order_Item_deteils) {
        this.order_Item_deteils = order_Item_deteils;
    }

    public String getOrder_qty() {
        return order_qty;
    }

    public void setOrder_qty(String order_qty) {
        this.order_qty = order_qty;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    @Override
    public String toString() {
        return "SupOrderRequest{" +
                "order_company_Name='" + order_company_Name + '\'' +
                ", order_supplier_Name='" + order_supplier_Name + '\'' +
                ", order_Deti='" + order_Deti + '\'' +
                ", order_company_address='" + order_company_address + '\'' +
                ", order_company_phone='" + order_company_phone + '\'' +
                ", order_suppplier_phone='" + order_suppplier_phone + '\'' +
                ", order_Item_deteils='" + order_Item_deteils + '\'' +
                ", order_qty='" + order_qty + '\'' +
                ", order_date='" + order_date + '\'' +
                '}';
    }
}



