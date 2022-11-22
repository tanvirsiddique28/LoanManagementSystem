package com.exam.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Loan implements Serializable {
@Id
@GeneratedValue

int id;
String loantype;
double loanamount;
int numberofmonths;
int interestrate;
double interestamount;
double monthlypayble;
double totalypayble;

public Loan() {
	
}

public Loan(int id) {
	
	this.id = id;
}

public Loan(String loantype, double loanamount, int numberofmonths, int interestrate, double interestamount,
		double monthlypayble, double totalypayble) {
	
	this.loantype = loantype;
	this.loanamount = loanamount;
	this.numberofmonths = numberofmonths;
	this.interestrate = interestrate;
	this.interestamount = interestamount;
	this.monthlypayble = monthlypayble;
	this.totalypayble = totalypayble;
}

public Loan(int id, String loantype, double loanamount, int numberofmonths, int interestrate, double interestamount,
		double monthlypayble, double totalypayble) {
	
	this.id = id;
	this.loantype = loantype;
	this.loanamount = loanamount;
	this.numberofmonths = numberofmonths;
	this.interestrate = interestrate;
	this.interestamount = interestamount;
	this.monthlypayble = monthlypayble;
	this.totalypayble = totalypayble;
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

public double getLoanamount() {
	return loanamount;
}

public void setLoanamount(double loanamount) {
	this.loanamount = loanamount;
}

public int getNumberofmonths() {
	return numberofmonths;
}

public void setNumberofmonths(int numberofmonths) {
	this.numberofmonths = numberofmonths;
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

public double getTotalypayble() {
	return totalypayble;
}

public void setTotalypayble(double totalypayble) {
	this.totalypayble = totalypayble;
}

@Override
public String toString() {
	return "Loan [id=" + id + ", loantype=" + loantype + ", loanamount=" + loanamount + ", numberofmonths="
			+ numberofmonths + ", interestrate=" + interestrate + ", interestamount=" + interestamount
			+ ", monthlypayble=" + monthlypayble + ", totalypayble=" + totalypayble + "]";
}





}
