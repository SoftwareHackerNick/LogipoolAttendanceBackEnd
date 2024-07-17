package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StudentMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int S_id;
	private String S_firstName;
	private String S_lastName;
	private String address;
	private String email;
	private double mobileNumber;
	private String education;
	private String collage;
	@OneToOne
	private CourseMaster enrollCourse;
	private String joinDate;
	private String endDate;
	private int paidFees;
	private int remainingFees;
	
	public StudentMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentMaster(int s_id, String s_firstName, String s_lastName, String address, String email,
			double mobileNumber, String education, String collage, CourseMaster enrollCourse, String joinDate,
			String endDate, int paidFees, int remainingFees) {
		super();
		S_id = s_id;
		S_firstName = s_firstName;
		S_lastName = s_lastName;
		this.address = address;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.education = education;
		this.collage = collage;
		this.enrollCourse = enrollCourse;
		this.joinDate = joinDate;
		this.endDate = endDate;
		this.paidFees = paidFees;
		this.remainingFees = remainingFees;
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getS_firstName() {
		return S_firstName;
	}
	public void setS_firstName(String s_firstName) {
		S_firstName = s_firstName;
	}
	public String getS_lastName() {
		return S_lastName;
	}
	public void setS_lastName(String s_lastName) {
		S_lastName = s_lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	public CourseMaster getEnrollCourse() {
		return enrollCourse;
	}
	public void setEnrollCourse(CourseMaster enrollCourse) {
		this.enrollCourse = enrollCourse;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getPaidFees() {
		return paidFees;
	}
	public void setPaidFees(int paidFees) {
		this.paidFees = paidFees;
	}
	public int getRemainingFees() {
		return remainingFees;
	}
	public void setRemainingFees(int remainingFees) {
		this.remainingFees = remainingFees;
	}
	@Override
	public String toString() {
		return "StudentMaster [S_id=" + S_id + ", S_firstName=" + S_firstName + ", S_lastName=" + S_lastName
				+ ", address=" + address + ", email=" + email + ", mobileNumber=" + mobileNumber + ", education="
				+ education + ", collage=" + collage + ", enrollCourse=" + enrollCourse + ", joinDate=" + joinDate
				+ ", endDate=" + endDate + ", paidFees=" + paidFees + ", remainingFees=" + remainingFees + "]";
	}
	

}
