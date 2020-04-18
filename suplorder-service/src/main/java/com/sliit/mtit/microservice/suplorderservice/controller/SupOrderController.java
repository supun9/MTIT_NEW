package com.sliit.mtit.microservice.suplorderservice.controller;


import com.sliit.mtit.microservice.suplorderservice.dto.SupOrderRequest;
import com.sliit.mtit.microservice.suplorderservice.dto.SupOrderResponse;
import com.sliit.mtit.microservice.suplorderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suporder")
public class SupOrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping(consumes = "application/json",produces = "application/json")
     public @ResponseBody
    SupOrderResponse createOrder(@RequestBody SupOrderRequest request){

        System.out.println("Order Details "+ request);



        return orderService.createOrer(request);


     }


}
