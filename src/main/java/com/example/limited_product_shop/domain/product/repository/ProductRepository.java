package com.example.limited_product_shop.domain.product.repository;

import com.example.limited_product_shop.domain.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
