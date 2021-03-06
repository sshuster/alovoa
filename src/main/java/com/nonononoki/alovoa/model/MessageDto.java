package com.nonononoki.alovoa.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nonononoki.alovoa.entity.Message;
import com.nonononoki.alovoa.entity.User;

import lombok.Data;

@Data
public class MessageDto {
	private long id;
	private Date date;
	private String content;
	private boolean from;
	
	public static MessageDto messageToDto(Message message, User user) {
		MessageDto dto = new MessageDto();
		dto.setId(message.getId());
		dto.setContent(message.getContent());
		dto.setDate(message.getCreationDate());
		dto.setFrom(message.getUserFrom().equals(user));
		return dto;
	}
	
	public static List<MessageDto> messagesToDtos(List<Message> messages, User user) {
		List<MessageDto> dtos = new ArrayList<>();
		for(int i = 0; i < messages.size(); i++) {
			dtos.add(MessageDto.messageToDto(messages.get(i), user));
		}
		return dtos;
	}
}
