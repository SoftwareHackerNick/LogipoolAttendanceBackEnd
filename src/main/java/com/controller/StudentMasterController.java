package com.controller;

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
import org.springframework.web.bind.annotation.RestController;


import com.model.StudentMaster;
import com.service.StudentMasterServiceImpl;

@RestController
@RequestMapping("StudentMaster")
@CrossOrigin("*")
public class StudentMasterController {
	@Autowired
	StudentMasterServiceImpl StudService;
	
	@PostMapping("/addStudent")
	public StudentMaster addStudentMaster(@RequestBody StudentMaster student) {
		//TODO: process POST request
		
		return StudService.addStudentMaster(student);
	}
	
	@GetMapping("getStudent")
	List<StudentMaster> getStudentMaster(){
		return StudService.getStudentMaster();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int S_id) {
		return StudService.deleteStudent(S_id);
	}
	
	@PutMapping("/updateCourse/{id}")
	public StudentMaster updateStudent( @RequestBody StudentMaster student,@PathVariable int S_id) {
		//TODO: process PUT request	
		return StudService.updateStudent(student, S_id);
	}

}
