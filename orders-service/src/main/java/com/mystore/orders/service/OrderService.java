package com.mystore.orders.service;

import com.mystore.orders.dto.OrderRequest;
import com.mystore.orders.dto.OrderResponse;
import com.mystore.orders.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@Service
public class OrderService {

    String GET_PROD_URL  = "http://product-service/products/{id}";


    @Autowired
    private DiscoveryClient discoveryClient ;

    public OrderResponse placeOrder(OrderRequest orderRequest) {

        // TODO: 1. retrieve the product details from the product-service


        // TODO: 2. process the order (total price should be = quantity ordered * product price)


        // TODO: 3. return the response

    }

}
