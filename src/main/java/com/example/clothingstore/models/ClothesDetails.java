package com.example.clothingstore.models;

import jakarta.persistence.*;

@Entity
@Table (name = "clothes_details")
public class ClothesDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @EnumeratedValue
    @Column(nullable = false)
    private ClothingType clothingType;

    @Column
    private double pricePerClothingType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClothingType getClothingType() {
        return clothingType;
    }

    public void setClothingType(ClothingType clothingType) {
        this.clothingType = clothingType;
    }

    public double getPricePerClothingType() {
        return pricePerClothingType;
    }

    public void setPricePerClothingType(double pricePerClothingType) {
        this.pricePerClothingType = pricePerClothingType;
    }
}
