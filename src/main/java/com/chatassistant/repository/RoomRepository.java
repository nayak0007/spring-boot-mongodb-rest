package com.chatassistant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.chatassistant.model.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
}
