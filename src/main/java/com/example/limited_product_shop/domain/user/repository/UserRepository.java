package com.example.limited_product_shop.domain.user.repository;

import com.example.limited_product_shop.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
