package com.messenger.resource.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.messenger.resource.Message;

public class MessageService {
	
	private Map<Long,Message> messages = DatabaseClass.getMessage();
	
	public MessageService() {
		messages.put(1L, new Message(1L, "Thalapathi", "thala"));
		messages.put(2L, new Message(2L, "tester", "thala"));
	}
	
	public List<Message> getMessages() {
		List<Message> msgList = new ArrayList<>();
		return new  ArrayList<Message>( messages.values());
	}
	
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		long id = messages.size();
		if(Objects.nonNull(message)) {
			message.setMsgId(id);
			messages.put(id, message);
		}
		return message;
	}
	
	public Message updateMessage(Message message) {
		long msgId = message.getMsgId();
		if(Objects.nonNull(messages.get(msgId))) {
			messages.put(msgId, message);
		}
		return message;
	}
	
	public Message deleteMessage(Message message) {
		messages.remove(message.getMsgId());
		return message;
	}

}
