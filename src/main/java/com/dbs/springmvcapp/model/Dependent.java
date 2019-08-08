package com.dbs.springmvcapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Dependent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
	
private String name;

private int age;
@ManyToOne
@JoinColumn(name="emp_id", nullable = false)
private Employee employee;
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Dependent [id=" + id + ", name=" + name + ", age=" + age + "]";
}
}
