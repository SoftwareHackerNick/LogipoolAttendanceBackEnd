package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class BatchMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String sdate;
	private String edate;
	@OneToOne
	private UserMaster trainer;
	@OneToOne
	private CourseMaster course;
	
	public BatchMaster() {
		// TODO Auto-generated constructor stub
	}

	public BatchMaster(int bid, String bname, String sdate, String edate, UserMaster trainer, CourseMaster course) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.sdate = sdate;
		this.edate = edate;
		this.trainer = trainer;
		this.course = course;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public UserMaster getTrainer() {
		return trainer;
	}

	public void setTrainer(UserMaster trainer) {
		this.trainer = trainer;
	}

	public CourseMaster getCourse() {
		return course;
	}

	public void setCourse(CourseMaster course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "BatchMaster [bid=" + bid + ", bname=" + bname + ", sdate=" + sdate + ", edate=" + edate + ", trainer="
				+ trainer + ", course=" + course + "]";
	}
	
	
	
	
	

	

}
