package com.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class BatchMaster {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int B_id;
	private String B_name;
	@OneToOne
	private CourseMaster coursemaster;
	@OneToOne
	private UserMaster userMaster;
	private String B_startDate;
	private String B_endDate;
	private String B_studentList;
	
	public BatchMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BatchMaster(int b_id, String b_name, CourseMaster coursemaster, UserMaster userMaster, String b_startDate,
			String b_endDate, String b_studentList) {
		super();
		B_id = b_id;
		B_name = b_name;
		this.coursemaster = coursemaster;
		this.userMaster = userMaster;
		B_startDate = b_startDate;
		B_endDate = b_endDate;
		B_studentList = b_studentList;
	}
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public String getB_name() {
		return B_name;
	}
	public void setB_name(String b_name) {
		B_name = b_name;
	}
	public CourseMaster getCoursemaster() {
		return coursemaster;
	}
	public void setCoursemaster(CourseMaster coursemaster) {
		this.coursemaster = coursemaster;
	}
	public UserMaster getUserMaster() {
		return userMaster;
	}
	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}
	public String getB_startDate() {
		return B_startDate;
	}
	public void setB_startDate(String b_startDate) {
		B_startDate = b_startDate;
	}
	public String getB_endDate() {
		return B_endDate;
	}
	public void setB_endDate(String b_endDate) {
		B_endDate = b_endDate;
	}
	public String getB_studentList() {
		return B_studentList;
	}
	public void setB_studentList(String b_studentList) {
		B_studentList = b_studentList;
	}
	@Override
	public String toString() {
		return "BatchMaster [B_id=" + B_id + ", B_name=" + B_name + ", coursemaster=" + coursemaster + ", userMaster="
				+ userMaster + ", B_startDate=" + B_startDate + ", B_endDate=" + B_endDate + ", B_studentList="
				+ B_studentList + "]";
	}

	

}
