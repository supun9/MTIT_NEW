package com.sliit.mtit.microservice.suplorderservice.service;


import java.util.UUID;

import com.sliit.mtit.microservice.suplorderservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class OrderServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public SupOrderResponse createOrer(SupOrderRequest supOrderRequest) {

        SupplierCreationRequest supplierCreationRequest = new SupplierCreationRequest();
        ReportCreationRequest reportCreationRequest = new ReportCreationRequest();

        reportCreationRequest.setSuppplier_address(supOrderRequest.getOrder_company_address());
        reportCreationRequest.setCompany_Name(supOrderRequest.getOrder_company_Name());
        reportCreationRequest.setSuppplier_Name(supOrderRequest.getOrder_supplier_Name());
        reportCreationRequest.setItem_deteils(supOrderRequest.getOrder_Item_deteils());
        reportCreationRequest.setOrder_date(supOrderRequest.getOrder_date());
        reportCreationRequest.setQty(supOrderRequest.getOrder_qty());
        reportCreationRequest.setCompany_phone(supOrderRequest.getOrder_company_phone());
        reportCreationRequest.setSuppplier_phone(supOrderRequest.getOrder_suppplier_phone());



        supplierCreationRequest.setSupplier_Name(supOrderRequest.getOrder_supplier_Name());
        supplierCreationRequest.setCompany_Name(supOrderRequest.getOrder_company_Name());
        supplierCreationRequest.setSupplier_address(supOrderRequest.getOrder_company_address());
        supplierCreationRequest.setSupplier_phone(supOrderRequest.getOrder_suppplier_phone());
        supplierCreationRequest.setSupplier_itemdeteils(supOrderRequest.getOrder_Item_deteils());

        ResponseEntity <SupplierCreationResponse> supplierCreationResponse = restTemplate.postForEntity("http://localhost:8080/supplier",supplierCreationRequest,SupplierCreationResponse.class);


        ResponseEntity <ReportCreationResponse> reportCreationResponseResponseEntity = restTemplate.postForEntity("http://localhost:8888/report",reportCreationRequest,ReportCreationResponse.class);


        var OrderResponse = new SupOrderResponse();
        OrderResponse.setOrderId(UUID.randomUUID().toString());
        OrderResponse.setSupId(supplierCreationResponse.getBody().getSupId());
        OrderResponse.setRepId(reportCreationResponseResponseEntity.getBody().getReportId());
        OrderResponse.setNote("Your order has been sent to the supplier");

        return OrderResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

        return builder.build();
    }
}
