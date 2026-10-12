package com.example.clothingstore.dto;

public class OrderRequest {
    private String idempotencyKey;
    private HashMap<Integer, ClothesDetails> quantityPerClothingType;
    private double totalPrice;

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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
