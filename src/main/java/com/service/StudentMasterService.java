package com.service;

import java.util.List;


import com.model.StudentMaster;

public interface StudentMasterService {


	StudentMaster addStudentMaster(StudentMaster student);
	
	List<StudentMaster> getStudentMaster();
	
    String deleteStudent(int S_id);
	
    StudentMaster updateStudent(StudentMaster student,int S_id);

}
