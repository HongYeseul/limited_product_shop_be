package com.example.limited_product_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LimitedProductShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitedProductShopApplication.class, args);
	}

}
