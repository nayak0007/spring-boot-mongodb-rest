package com.chatassistant.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.chatassistant.model.Message;

public interface MessageRepository extends MongoRepository<Message, String>{
	
	@Query(value="{roomId:'?0'}")
    List<Message> findAll(String id);
	
}
