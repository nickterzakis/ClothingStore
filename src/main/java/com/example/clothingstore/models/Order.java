package com.example.clothingstore.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashMap;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String idempotencyKey;

    @Column
    private HashMap<Integer, ClothesDetails> quantityPerClothingType;

    @Column(nullable = false)
    private double totalPrice;

    private LocalDateTime createdAt;
    private LocalDateTime sentAt;
}
