package com.service;

import java.util.List;

import com.model.User;

public interface ServiceI {
	void addUser();
	
	List<User> displayDetails();
	
	void updateDetails();

	void deleteDetails();
	
	void updateNewWay();
}
