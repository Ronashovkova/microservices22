package com.cursor.deliveryservice.service;

import com.cursor.deliveryservice.model.Delivery;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class DeliveryService {

    private static Map<Long, Delivery> idToDeliveryMap = new HashMap<>();

    public static void addDelivery(Long id, Delivery delivery) {
        idToDeliveryMap.put(id, delivery);
    }
}
