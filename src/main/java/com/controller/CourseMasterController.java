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

import com.model.CourseMaster;
import com.service.CourseMasterServiceImpl;

@RestController
@RequestMapping("/CourseMaster")
@CrossOrigin("*")
public class CourseMasterController {
	
	@Autowired
	CourseMasterServiceImpl courseService;
	
	@PostMapping("/addCourse")
	public CourseMaster addCourseMaster(@RequestBody CourseMaster course) {
		//TODO: process POST request
		
		return courseService.addCourseMaster(course);
	}
	
	@GetMapping("/getCourse")
	List<CourseMaster> getCourseMaster(){
		return courseService.getCourseMaster();
	}
	
	@DeleteMapping("deleteCourse/{id}")
	public String deleteCourse(@PathVariable int id) {
		return courseService.deleteCourse(id);		
	}
	
	@PutMapping("updateCourse/{id}")
	public CourseMaster updateCourse( @RequestBody CourseMaster course,@PathVariable int id) {
		//TODO: process PUT request	
		return courseService.updateCourse(course, id);
	}

	

}
