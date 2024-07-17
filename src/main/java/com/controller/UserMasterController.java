package com.controller;

import org.springframework.web.bind.annotation.RestController;

import com.model.UserMaster;
import com.service.UserMasterServiceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/UserMaster")
@CrossOrigin("*")
public class UserMasterController {
	
	@Autowired
	UserMasterServiceImpl userService;
	
	@PostMapping("/addUserMaster")
	public UserMaster addUserMaster(@RequestBody UserMaster user) {
		//TODO: process POST request
		
		return userService.addUserMaster(user);
	}
	
	@GetMapping("/getUserMaster")
	List<UserMaster> getUserMaster(){
		return userService.getUserMaster();
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUserMaster(@PathVariable int id) {
		return userService.deleteUser(id);
	}
	
	@PutMapping("updateUserMaster/{id}")
	public UserMaster updateUserMaster( @RequestBody UserMaster user,@PathVariable int id) {
		//TODO: process PUT request
		
		return userService.updateUser(user, id);
	}

}
