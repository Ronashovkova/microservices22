package com.cursor.orderservice.controller;

import com.cursor.orderservice.model.Order;
import com.cursor.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping("/{id}")
    public void saveOrder(@PathVariable("id") Long id, Order order) {
        OrderService.putOrder(id, order);
    }
}