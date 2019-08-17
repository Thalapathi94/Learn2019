package com.messenger.resource;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private long msgId;
	private String message;
	private String author;
	private Date createDate;
	
	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Message(long msgId, String message, String author) {
		this.msgId = msgId;
		this.message = message;
		this.author = author;
		this.createDate = new Date();
	}
	
	public Message() {
		
	}
	
	

}
