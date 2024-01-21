package com.fit.se.controller;

import com.fit.se.model.Order;
import com.fit.se.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;
    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getOrders(){
        List<Order> orders = orderRepository.findAll();
        return ResponseEntity.ok(orders);
    }
}
