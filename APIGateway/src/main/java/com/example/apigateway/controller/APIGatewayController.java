package com.example.apigateway.controller;

import com.example.apigateway.dto.OrderDTO;
import com.example.apigateway.dto.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/router")
public class APIGatewayController<T> {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{service}")
    public ResponseEntity<T> getAPIGateway(@PathVariable("service") String service) {
        if (service.equals("orders")) {
            String request = "http://localhost:8585/api/v1/orders";
            OrderDTO[] orderDTOS = restTemplate.getForObject(request, OrderDTO[].class);
            return ResponseEntity.ok((T) Arrays.asList(orderDTOS));
        } else if (service.equals("products")) {
            String request = "http://localhost:9191/api/v1/product";
            ProductDTO[] productDTOS = restTemplate.getForObject(request,ProductDTO[].class);
            return ResponseEntity.ok((T) Arrays.asList(productDTOS));
        }
        return ResponseEntity.notFound().build();
    }
}
