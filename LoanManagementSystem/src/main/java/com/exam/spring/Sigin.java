package com.exam.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sigin implements Serializable {
@Id
@GeneratedValue

int id;
String username;
String password;
String email;

public Sigin() {

}

public Sigin(int id) {
	
	this.id = id;
}

public Sigin(String username, String password, String email) {
	
	this.username = username;
	this.password = password;
	this.email = email;
}

public Sigin(int id, String username, String password, String email) {
	
	this.id = id;
	this.username = username;
	this.password = password;
	this.email = email;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Sigin [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
}




}
