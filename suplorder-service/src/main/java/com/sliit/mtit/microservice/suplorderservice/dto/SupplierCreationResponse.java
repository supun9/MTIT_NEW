package com.sliit.mtit.microservice.suplorderservice.dto;

public class SupplierCreationResponse {

    private String supId;
    private String note;

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
