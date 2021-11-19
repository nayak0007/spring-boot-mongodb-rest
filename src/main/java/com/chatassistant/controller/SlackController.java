package com.chatassistant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatassistant.Service.ChatService;
import com.chatassistant.model.Message;
import com.chatassistant.model.MessageCreationRequest;
import com.chatassistant.model.Room;
import com.chatassistant.model.RoomCreationRequest;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value = "/api/sclone")
@RequiredArgsConstructor
public class SlackController {

	@Autowired
	private ChatService chatService;

	@PostMapping("/createroom")
	public ResponseEntity<Room> createRoom(@RequestBody RoomCreationRequest request) {
		return ResponseEntity.ok(chatService.createRoom(request));
	}

	@GetMapping("/getallroom")
	public ResponseEntity getAllRoom() {
		return ResponseEntity.ok(chatService.getAllRoom());
	}

	@GetMapping(value = "/messages/{id}")
	public ResponseEntity getMessages(@PathVariable("id") String id) {
		return ResponseEntity.ok(chatService.getMessages(id));
	}

	@PostMapping("/createmessage")
	public ResponseEntity<Message> createMessage(@RequestBody MessageCreationRequest request) {
		return ResponseEntity.ok(chatService.createMessage(request));
	}

}
