package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMasterRepository;
import com.model.UserMaster;

@Service
public class UserMasterServiceImpl implements UserMasterService {

	@Autowired
	UserMasterRepository userMasterRepo;

	@Override
	public UserMaster addUserMaster(UserMaster user) {
		
		return userMasterRepo.save(user);
	}

	@Override
	public List<UserMaster> getUserMaster() {
		// TODO Auto-generated method stub
		return userMasterRepo.findAll();
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		userMasterRepo.deleteById(id);
		return "User Master Deleted";
	}

	@Override
	public UserMaster updateUser(UserMaster user, int id) {
		// TODO Auto-generated method stub
		
			
			UserMaster existingUser =userMasterRepo.findById(id).orElse(null);
			
			if(existingUser!=null) {
				existingUser.setFname(user.getFname());
				existingUser.setLname(user.getLname());
				existingUser.setEmail(user.getEmail());
				existingUser.setMobileNo(user.getMobileNo());
				existingUser.setAddress(user.getAddress());
				existingUser.setSubject(user.getSubject());
				
				
			}
			else {
				System.out.println("User Master Record is null");
			}
			
			return userMasterRepo.save(existingUser);
		}
	
	
	
	
}
