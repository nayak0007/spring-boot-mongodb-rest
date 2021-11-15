package com.chatassistant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatassistant.model.Message;

public interface MessageRepository extends MongoRepository<Message, String>{

}
