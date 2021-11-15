package com.chatassistant.model;

import lombok.Data;

@Data
public class RoomCreationRequest {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
