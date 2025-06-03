package com.paynearbyOrderAPI.OrderAPI.service;

import com.paynearbyOrderAPI.OrderAPI.dtos.OrderRequest;
import com.paynearbyOrderAPI.OrderAPI.exception.ResourceNotFoundException;
import com.paynearbyOrderAPI.OrderAPI.model.Order;
import com.paynearbyOrderAPI.OrderAPI.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
// OrderService.java
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class OrderService {
    private final Map<Long, Order> orderMap = new HashMap<>();
    private long currentId = 1;

    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    public Order getOrderById(Long id) {
        return orderMap.get(id);
    }

    public Order createOrder(Order order) {
        order.setId(currentId++);
        orderMap.put(order.getId(), order);
        return order;
    }

    public Order updateOrder(Long id, Order updatedOrder) {
        if (!orderMap.containsKey(id)) return null;
        updatedOrder.setId(id);
        orderMap.put(id, updatedOrder);
        return updatedOrder;
    }

    public boolean deleteOrder(Long id) {
        return orderMap.remove(id) != null;
    }
}
