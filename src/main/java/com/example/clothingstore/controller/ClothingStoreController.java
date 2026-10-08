package com.example.clothingstore.controller;

import com.example.clothingstore.dto.OrderRequest;
import com.example.clothingstore.models.Order;
import com.example.clothingstore.service.ClothingStoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClothingStoreController {

    private final ClothingStoreService service;

    @PostMapping
    public ResponseEntity<Order> createOrder (@RequestBody OrderRequest request) {

    }

}
