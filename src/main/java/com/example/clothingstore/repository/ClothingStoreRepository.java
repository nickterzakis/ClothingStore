package com.example.clothingstore.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface ClothingStoreRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByIdempotencyKey(String idempotencyKey);

}
