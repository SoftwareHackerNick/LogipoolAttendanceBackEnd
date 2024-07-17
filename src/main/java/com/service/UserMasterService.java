package com.service;

import java.util.List;

import com.model.UserMaster;

public interface UserMasterService {

	UserMaster addUserMaster(UserMaster user);
	
	List<UserMaster> getUserMaster();
	
	String deleteUser(int id);
	
	UserMaster updateUser(UserMaster user,int id);
}
