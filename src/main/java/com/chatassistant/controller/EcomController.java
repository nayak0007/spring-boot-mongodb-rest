package com.chatassistant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatassistant.Service.EcomService;
import com.chatassistant.model.ProductResponse;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/api/ecom")
@RequiredArgsConstructor
public class EcomController {
	
	@Autowired
	private EcomService ecomService;
	
	@GetMapping("/products")
	public ProductResponse getAllProduct() {
		return ecomService.getAllProduct();
	}

}
