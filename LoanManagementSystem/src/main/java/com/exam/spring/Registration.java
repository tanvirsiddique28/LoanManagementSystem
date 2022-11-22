package com.exam.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registration implements Serializable {
@Id
@GeneratedValue

int id;
String name;
String nid;
String email;
String mobile;
String address;
String gender;
int age;

public Registration() {
	
}

public Registration(int id) {
	
	this.id = id;
}

public Registration(String name, String nid, String email, String mobile, String address, String gender, int age) {
	
	this.name = name;
	this.nid = nid;
	this.email = email;
	this.mobile = mobile;
	this.address = address;
	this.gender = gender;
	this.age = age;
}

public Registration(int id, String name, String nid, String email, String mobile, String address, String gender,
		int age) {
	
	this.id = id;
	this.name = name;
	this.nid = nid;
	this.email = email;
	this.mobile = mobile;
	this.address = address;
	this.gender = gender;
	this.age = age;
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

public String getNid() {
	return nid;
}

public void setNid(String nid) {
	this.nid = nid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Registration [id=" + id + ", name=" + name + ", nid=" + nid + ", email=" + email + ", mobile=" + mobile
			+ ", address=" + address + ", gender=" + gender + ", age=" + age + "]";
}





}
