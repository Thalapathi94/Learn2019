package com.messenger.resource.service;

import java.util.HashMap;
import java.util.Map;

import com.messenger.resource.Message;

public class DatabaseClass {
	
public static Map<Long,Message> messages= new HashMap<>();

public static Map<Long,Message> getMessage() {
	
	return messages;
}
	
}
