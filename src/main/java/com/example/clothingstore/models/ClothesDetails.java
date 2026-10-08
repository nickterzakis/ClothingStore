package com.example.clothingstore.models;

import jakarta.persistence.*;

@Entity
@Table (name = "clothes_details")
public class ClothesDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private ClothingType clothingType;

    @Column
    private double pricePerClothingType;
}
