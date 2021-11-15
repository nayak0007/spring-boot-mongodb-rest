package com.chatassistant.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatassistant.exception.EntityNotFoundException;
import com.chatassistant.model.Room;
import com.chatassistant.model.RoomCreationRequest;
import com.chatassistant.repository.MessageRepository;
import com.chatassistant.repository.RoomRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatService {

	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private MessageRepository messageRepository;

	public List<Room> getAllRoom() {
		return roomRepository.findAll();
	}

	public Room getRoom(String id) {
		Optional<Room> book = roomRepository.findById(id);
		if (book.isPresent()) {
			return book.get();
		}
		throw new EntityNotFoundException("Cant find any book under given ID");
	}
	
	public Room createRoom(RoomCreationRequest room) {
		Room roomToCreate = new Room();
		BeanUtils.copyProperties(room, roomToCreate);
		System.out.println("RoomName>>"+roomToCreate.getName());
		return roomRepository.save(roomToCreate);
	}

}
