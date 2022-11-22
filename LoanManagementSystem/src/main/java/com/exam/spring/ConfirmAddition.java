package com.exam.spring;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ConfirmAddition {

	@Autowired
	private ApplyService as;
	
	@Autowired
	private ConfirmInterface ci;
	
	@Autowired
	private ApplyInterface ai;
	
	public void insertInCon(@RequestParam int customerid,Model m) {
		   
		   Applyloan al = ai.getByAppCustomerId(customerid);
		   
		     LocalDate date = LocalDate.now();
			 LocalDate stp = date.plusDays(30);
			 LocalDate etp = stp.plusDays(5);
			 
			 String astrDate = date.toString();
			 String sstrDate = stp.toString(); 
			 String estrDate = etp.toString(); 
		   
		   Confirm c = new Confirm();
		   c.setCustomerid(al.customerid);
		   c.setName(al.name);
		   c.setLoantype(al.loantype);
		   c.setLoanamount(al.loanamount);
		   c.setNumberofmonths(al.months);
		   c.setMothlypayble(al.monthlypayble);
		   c.setTotalpayble(al.totalpayble);
		   c.setApprovaldate(astrDate);
		   c.setStartpay(sstrDate);
		   c.setEndpay(estrDate);
		   c.setStatus("Running");
		   c.setRemaingpayble(al.totalpayble);
		   c.setRemainingmonths(al.months);
		   
		   ci.save(c);
	   }
public void getLatesttDate(Model m) {
		String s =  "# Congartulations!!! ";
		String s1 = "# Your next payment date is: ";
		String s2 = "# Your last payment date is: ";
		
		
		
  	  List <Confirm> list = ci.getMaxDate();
  	  Confirm l = list.get(list.size()-1);
  	  m.addAttribute("msg1", s);
  	  m.addAttribute("msg2", s1+l.startpay);
  	  m.addAttribute("msg3", s2+l.endpay);
  	  
  	  System.out.println(s1+l.startpay);
  	  System.out.println(s2+l.endpay);
  	 
  	  
	}
}
