package com.chatassistant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatassistant.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
