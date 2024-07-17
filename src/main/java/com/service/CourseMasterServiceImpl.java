package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CourseMasterRepository;
import com.model.CourseMaster;

@Service
public class CourseMasterServiceImpl implements CourseMasterService{
	
	@Autowired
	CourseMasterRepository courseRepo;

	@Override
	public CourseMaster addCourseMaster(CourseMaster course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}

	@Override
	public List<CourseMaster> getCourseMaster() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	@Override
	public String deleteCourse(int id) {
		// TODO Auto-generated method stub
		courseRepo.deleteById(id);
		return "Course Deleted Successfully.";
	}

	
	@Override
	public CourseMaster updateCourse(CourseMaster course, int id) {
		// TODO Auto-generated method stub
		CourseMaster existingCourse =courseRepo.findById(id).orElse(null);
		
		if(existingCourse!=null) {
			existingCourse.setId(course.getId());
			existingCourse.setName(course.getName());
			existingCourse.setDescription(course.getDescription());
			existingCourse.setFees(course.getFees());
			
		}
		else {
			System.out.println("Course Master Record is null");
		}
		
		return courseRepo.save(existingCourse);
	}
	
}


