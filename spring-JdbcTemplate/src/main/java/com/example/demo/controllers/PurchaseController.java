package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Purchase;
import com.example.demo.repositories.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	private final PurchaseRepository purchaseRepository;
	
	public PurchaseController(PurchaseRepository purchaseRepository) {
	this.purchaseRepository = purchaseRepository;
	}
	
	@GetMapping
	public List<Purchase> findPurchases() {
		return purchaseRepository.findAllPurchases();
	}
	
	@PostMapping
	public void storePurchase(@RequestBody Purchase purchase) {
		purchaseRepository.storePurchase(purchase);
	}
	
}
