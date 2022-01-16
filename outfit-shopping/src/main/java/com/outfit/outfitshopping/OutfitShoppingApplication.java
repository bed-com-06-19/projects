package com.outfit.outfitshopping;

import com.outfit.outfitshopping.customer.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class OutfitShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OutfitShoppingApplication.class, args);
	}

	}


