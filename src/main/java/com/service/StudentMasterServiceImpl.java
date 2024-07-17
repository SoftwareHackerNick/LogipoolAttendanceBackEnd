package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentMasterRepository;

import com.model.StudentMaster;

@Service
public class StudentMasterServiceImpl implements StudentMasterService{
	
	@Autowired
	StudentMasterRepository StudRepo;

	@Override
	public StudentMaster addStudentMaster(StudentMaster student) {
		// TODO Auto-generated method stub
		return StudRepo.save(student);
	}

	@Override
	public List<StudentMaster> getStudentMaster() {
		// TODO Auto-generated method stub
		return StudRepo.findAll();
	}

	@Override
	public String deleteStudent(int S_id) {
		// TODO Auto-generated method stub
		StudRepo.deleteById(S_id);
		return "Student Deleted";
	}

	@Override
	public StudentMaster updateStudent(StudentMaster student, int S_id) {
		// TODO Auto-generated method stub
		StudentMaster existingStudent =StudRepo.findById(S_id).orElse(null);
		
		if(existingStudent!=null) {
			existingStudent.setS_firstName(student.getS_firstName());
			existingStudent.setS_lastName(student.getS_lastName());;
			existingStudent.setAddress(student.getAddress());
			existingStudent.setMobileNumber(student.getMobileNumber());
			existingStudent.setEducation(student.getEducation());
			existingStudent.setCollage(student.getCollage());
			existingStudent.setEnrollCourse(student.getEnrollCourse());
			existingStudent.setJoinDate(student.getJoinDate());
			existingStudent.setEndDate(student.getEndDate());
			existingStudent.setPaidFees(student.getPaidFees());
			existingStudent.setRemainingFees(student.getRemainingFees());
			
			
			
			
		}
		else {
			System.out.println("Student Record is null");
		}
		
		return StudRepo.save(existingStudent);
	}

}
