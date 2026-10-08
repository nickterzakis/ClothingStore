package com.example.clothingstore.service;

import com.example.clothingstore.dto.OrderRequest;
import com.example.clothingstore.models.Order;

public interface ClothingStoreService {
    Order createOrder(OrderRequest request);


}
