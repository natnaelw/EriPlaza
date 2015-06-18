package com.mum.eriplaza.services;

import com.mum.eriplaza.domain.User;

public interface UserService {
	void getUser(User user);
	void saveUser(User user);
	
	void addNewUser(User user);
	public User getUser(Long userId);
	
	public User getUserByName(String name);
	



}
