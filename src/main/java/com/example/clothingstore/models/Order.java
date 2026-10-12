package com.example.clothingstore.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashMap;

@Entity
@Table(name = "orders")
public class Order {
    public Order (String idempotencyKey, HashMap<Integer, ClothesDetails> quantityPerClothingType, double totalPrice) {
        this.idempotencyKey = idempotencyKey;
        this.quantityPerClothingType = quantityPerClothingType;
        this.totalPrice = totalPrice;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String idempotencyKey;

    @Column
    private HashMap<Integer, ClothesDetails> quantityPerClothingType;

    @Enumerated
    @Column
    private OrderStatus orderStatus;

    @Column(nullable = false)
    private double totalPrice;

    private LocalDateTime createdAt;
    private LocalDateTime sentAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public HashMap<Integer, ClothesDetails> getQuantityPerClothingType() {
        return quantityPerClothingType;
    }

    public void setQuantityPerClothingType(HashMap<Integer, ClothesDetails> quantityPerClothingType) {
        this.quantityPerClothingType = quantityPerClothingType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
}
