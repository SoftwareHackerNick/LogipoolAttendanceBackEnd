package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseMaster {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String description;
private double fees;
public CourseMaster() {
	super();
	// TODO Auto-generated constructor stub
}
public CourseMaster(int id, String name, String description, double fees) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.fees = fees;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "CourseMaster [id=" + id + ", name=" + name + ", description=" + description + ", fees=" + fees + "]";
}


}
