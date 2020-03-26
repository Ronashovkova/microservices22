package com.cursor.deliveryservice.controller;

import com.cursor.deliveryservice.model.Delivery;
import com.cursor.deliveryservice.service.DeliveryService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @PostMapping("/{id}")
    public void addDelivery(@PathVariable("id") Long id, Delivery delivery) {
        DeliveryService.addDelivery(id, delivery);
    }
}
