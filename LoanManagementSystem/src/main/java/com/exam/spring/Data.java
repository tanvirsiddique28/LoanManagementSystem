package com.exam.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data implements Serializable {
@Id
@GeneratedValue

int id;
String loantype;
double minamount;
double maxamount;
int minmonths;
int maxmonths;
int interestrate;
int minage;
double minnetincome;
double maxnetincome;
public Data() {
	
}
public Data(int id) {
	
	this.id = id;
}
public Data(String loantype, double minamount, double maxamount, int minmonths, int maxmonths, int interestrate,
		int minage, double minnetincome, double maxnetincome) {
	
	this.loantype = loantype;
	this.minamount = minamount;
	this.maxamount = maxamount;
	this.minmonths = minmonths;
	this.maxmonths = maxmonths;
	this.interestrate = interestrate;
	this.minage = minage;
	this.minnetincome = minnetincome;
	this.maxnetincome = maxnetincome;
}
public Data(int id, String loantype, double minamount, double maxamount, int minmonths, int maxmonths, int interestrate,
		int minage, double minnetincome, double maxnetincome) {
	
	this.id = id;
	this.loantype = loantype;
	this.minamount = minamount;
	this.maxamount = maxamount;
	this.minmonths = minmonths;
	this.maxmonths = maxmonths;
	this.interestrate = interestrate;
	this.minage = minage;
	this.minnetincome = minnetincome;
	this.maxnetincome = maxnetincome;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLoantype() {
	return loantype;
}
public void setLoantype(String loantype) {
	this.loantype = loantype;
}
public double getMinamount() {
	return minamount;
}
public void setMinamount(double minamount) {
	this.minamount = minamount;
}
public double getMaxamount() {
	return maxamount;
}
public void setMaxamount(double maxamount) {
	this.maxamount = maxamount;
}
public int getMinmonths() {
	return minmonths;
}
public void setMinmonths(int minmonths) {
	this.minmonths = minmonths;
}
public int getMaxmonths() {
	return maxmonths;
}
public void setMaxmonths(int maxmonths) {
	this.maxmonths = maxmonths;
}
public int getInterestrate() {
	return interestrate;
}
public void setInterestrate(int interestrate) {
	this.interestrate = interestrate;
}
public int getMinage() {
	return minage;
}
public void setMinage(int minage) {
	this.minage = minage;
}
public double getMinnetincome() {
	return minnetincome;
}
public void setMinnetincome(double minnetincome) {
	this.minnetincome = minnetincome;
}
public double getMaxnetincome() {
	return maxnetincome;
}
public void setMaxnetincome(double maxnetincome) {
	this.maxnetincome = maxnetincome;
}
@Override
public String toString() {
	return "Data [id=" + id + ", loantype=" + loantype + ", minamount=" + minamount + ", maxamount=" + maxamount
			+ ", minmonths=" + minmonths + ", maxmonths=" + maxmonths + ", interestrate=" + interestrate + ", minage="
			+ minage + ", minnetincome=" + minnetincome + ", maxnetincome=" + maxnetincome + "]";
}


}
