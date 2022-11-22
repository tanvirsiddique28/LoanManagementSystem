package com.exam.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Applyloan implements Serializable {
@Id
@GeneratedValue

int id;
int customerid;
String name;
String nid;
int age;
String tin;
double netincome;
String gurantor;
String gurantornid;
String loantype;
double loanamount;
int months;
int interestrate;
double interestamount;
double monthlypayble;
double totalpayble;
String status;

public Applyloan() {
	
}

public Applyloan(int id) {
	
	this.id = id;
}

public Applyloan(int customerid, String name, String nid, int age, String tin, double netincome, String gurantor,
		String gurantornid, String loantype, double loanamount, int months, int interestrate, double interestamount,
		double monthlypayble, double totalpayble, String status) {
	
	this.customerid = customerid;
	this.name = name;
	this.nid = nid;
	this.age = age;
	this.tin = tin;
	this.netincome = netincome;
	this.gurantor = gurantor;
	this.gurantornid = gurantornid;
	this.loantype = loantype;
	this.loanamount = loanamount;
	this.months = months;
	this.interestrate = interestrate;
	this.interestamount = interestamount;
	this.monthlypayble = monthlypayble;
	this.totalpayble = totalpayble;
	this.status = status;
}

public Applyloan(int id, int customerid, String name, String nid, int age, String tin, double netincome,
		String gurantor, String gurantornid, String loantype, double loanamount, int months, int interestrate,
		double interestamount, double monthlypayble, double totalpayble, String status) {
	
	this.id = id;
	this.customerid = customerid;
	this.name = name;
	this.nid = nid;
	this.age = age;
	this.tin = tin;
	this.netincome = netincome;
	this.gurantor = gurantor;
	this.gurantornid = gurantornid;
	this.loantype = loantype;
	this.loanamount = loanamount;
	this.months = months;
	this.interestrate = interestrate;
	this.interestamount = interestamount;
	this.monthlypayble = monthlypayble;
	this.totalpayble = totalpayble;
	this.status = status;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getCustomerid() {
	return customerid;
}

public void setCustomerid(int customerid) {
	this.customerid = customerid;
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getTin() {
	return tin;
}

public void setTin(String tin) {
	this.tin = tin;
}

public double getNetincome() {
	return netincome;
}

public void setNetincome(double netincome) {
	this.netincome = netincome;
}

public String getGurantor() {
	return gurantor;
}

public void setGurantor(String gurantor) {
	this.gurantor = gurantor;
}

public String getGurantornid() {
	return gurantornid;
}

public void setGurantornid(String gurantornid) {
	this.gurantornid = gurantornid;
}

public String getLoantype() {
	return loantype;
}

public void setLoantype(String loantype) {
	this.loantype = loantype;
}

public double getLoanamount() {
	return loanamount;
}

public void setLoanamount(double loanamount) {
	this.loanamount = loanamount;
}

public int getMonths() {
	return months;
}

public void setMonths(int months) {
	this.months = months;
}

public int getInterestrate() {
	return interestrate;
}

public void setInterestrate(int interestrate) {
	this.interestrate = interestrate;
}

public double getInterestamount() {
	return interestamount;
}

public void setInterestamount(double interestamount) {
	this.interestamount = interestamount;
}

public double getMonthlypayble() {
	return monthlypayble;
}

public void setMonthlypayble(double monthlypayble) {
	this.monthlypayble = monthlypayble;
}

public double getTotalpayble() {
	return totalpayble;
}

public void setTotalpayble(double totalpayble) {
	this.totalpayble = totalpayble;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "Applyloan [id=" + id + ", customerid=" + customerid + ", name=" + name + ", nid=" + nid + ", age=" + age
			+ ", tin=" + tin + ", netincome=" + netincome + ", gurantor=" + gurantor + ", gurantornid=" + gurantornid
			+ ", loantype=" + loantype + ", loanamount=" + loanamount + ", months=" + months + ", interestrate="
			+ interestrate + ", interestamount=" + interestamount + ", monthlypayble=" + monthlypayble
			+ ", totalpayble=" + totalpayble + ", status=" + status + "]";
}







}
