package com.sanju.login.service;

import java.util.HashMap;

import com.sanju.login.model.User;

public class LoginService {

	HashMap<String, String> users = new HashMap<>();
	
	public LoginService() {
	  users.put("sanju", "1234");
	  users.put("vivek", "123456");
	  users.put("sumit", "12345678");
	}
	
	public boolean authenticate(String name, String password) {
		if (users.containsKey(name) && users.get(name).equals(password)) {
			return true;
		}
		return false;
	}
	
	public String getUser(String userId) {
		User user = new User();
		
		user.setName(users.get(userId));
		return users.get(userId);
	}
	
	public void setUser(String name, String password) {
		users.put(name, password);
	}
}
