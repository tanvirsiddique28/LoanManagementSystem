package com.exam.spring;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Confirm implements Serializable {
@Id
@GeneratedValue

int id;
int customerid;
String name;
String loantype;
double loanamount;
double mothlypayble;
int numberofmonths;
double totalpayble;
double extracharge;
String approvaldate;
String startpay;
String endpay;
String status;
double collections;
double remaingpayble;
int remainingmonths;
String lastpaydate;
public Confirm() {
	
}
public Confirm(int id) {
	super();
	this.id = id;
}
public Confirm(int customerid, String name, String loantype, double loanamount, double mothlypayble, int numberofmonths,
		double totalpayble, double extracharge, String approvaldate, String startpay, String endpay, String status,
		double collections, double remaingpayble, int remainingmonths, String lastpaydate) {
	super();
	this.customerid = customerid;
	this.name = name;
	this.loantype = loantype;
	this.loanamount = loanamount;
	this.mothlypayble = mothlypayble;
	this.numberofmonths = numberofmonths;
	this.totalpayble = totalpayble;
	this.extracharge = extracharge;
	this.approvaldate = approvaldate;
	this.startpay = startpay;
	this.endpay = endpay;
	this.status = status;
	this.collections = collections;
	this.remaingpayble = remaingpayble;
	this.remainingmonths = remainingmonths;
	this.lastpaydate = lastpaydate;
}
public Confirm(int id, int customerid, String name, String loantype, double loanamount, double mothlypayble,
		int numberofmonths, double totalpayble, double extracharge, String approvaldate, String startpay, String endpay,
		String status, double collections, double remaingpayble, int remainingmonths, String lastpaydate) {
	super();
	this.id = id;
	this.customerid = customerid;
	this.name = name;
	this.loantype = loantype;
	this.loanamount = loanamount;
	this.mothlypayble = mothlypayble;
	this.numberofmonths = numberofmonths;
	this.totalpayble = totalpayble;
	this.extracharge = extracharge;
	this.approvaldate = approvaldate;
	this.startpay = startpay;
	this.endpay = endpay;
	this.status = status;
	this.collections = collections;
	this.remaingpayble = remaingpayble;
	this.remainingmonths = remainingmonths;
	this.lastpaydate = lastpaydate;
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
public double getMothlypayble() {
	return mothlypayble;
}
public void setMothlypayble(double mothlypayble) {
	this.mothlypayble = mothlypayble;
}
public int getNumberofmonths() {
	return numberofmonths;
}
public void setNumberofmonths(int numberofmonths) {
	this.numberofmonths = numberofmonths;
}
public double getTotalpayble() {
	return totalpayble;
}
public void setTotalpayble(double totalpayble) {
	this.totalpayble = totalpayble;
}
public double getExtracharge() {
	return extracharge;
}
public void setExtracharge(double extracharge) {
	this.extracharge = extracharge;
}
public String getApprovaldate() {
	return approvaldate;
}
public void setApprovaldate(String approvaldate) {
	this.approvaldate = approvaldate;
}
public String getStartpay() {
	return startpay;
}
public void setStartpay(String startpay) {
	this.startpay = startpay;
}
public String getEndpay() {
	return endpay;
}
public void setEndpay(String endpay) {
	this.endpay = endpay;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public double getCollections() {
	return collections;
}
public void setCollections(double collections) {
	this.collections = collections;
}
public double getRemaingpayble() {
	return remaingpayble;
}
public void setRemaingpayble(double remaingpayble) {
	this.remaingpayble = remaingpayble;
}
public int getRemainingmonths() {
	return remainingmonths;
}
public void setRemainingmonths(int remainingmonths) {
	this.remainingmonths = remainingmonths;
}
public String getLastpaydate() {
	return lastpaydate;
}
public void setLastpaydate(String lastpaydate) {
	this.lastpaydate = lastpaydate;
}
@Override
public String toString() {
	return "Confirm [id=" + id + ", customerid=" + customerid + ", name=" + name + ", loantype=" + loantype
			+ ", loanamount=" + loanamount + ", mothlypayble=" + mothlypayble + ", numberofmonths=" + numberofmonths
			+ ", totalpayble=" + totalpayble + ", extracharge=" + extracharge + ", approvaldate=" + approvaldate
			+ ", startpay=" + startpay + ", endpay=" + endpay + ", status=" + status + ", collections=" + collections
			+ ", remaingpayble=" + remaingpayble + ", remainingmonths=" + remainingmonths + ", lastpaydate="
			+ lastpaydate + "]";
}












}
