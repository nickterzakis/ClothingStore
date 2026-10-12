package com.example.clothingstore.service;

import org.springframework.stereotype.Service;

@Service
public class ClothingStoreServiceImpl {

    private ClothingStoreRepository repository;

    public Order createOrder(OrderRequest orderRequest) {
        Order order = new Order(orderRequest.getIdempotencyKey(), orderRequest.getQuantityPerClothingType(), orderRequest.getTotalPrice());
        return order;
    }

    public Optional<Order> findById(Long id) {
        Optional<Order> searchedOrder = repository.findById(id);
        return searchedOrder;
    }

    void fullyRefundOrder()

}
