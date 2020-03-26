package com.cursor.orderservice.service;

import com.cursor.orderservice.model.Order;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class OrderService {

    private static Map<Long, Order> idToOrderMap = new HashMap<>();

    public static void putOrder(Long id, Order order) {
        idToOrderMap.put(id, order);
    }
}


