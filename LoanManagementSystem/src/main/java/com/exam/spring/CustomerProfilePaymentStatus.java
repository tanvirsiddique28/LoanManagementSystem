package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerProfilePaymentStatus {
 
	@Autowired
	public ConfirmInterface ci;
	
	@RequestMapping("customerprofile")
	public String customerProfile() {
		 return "customerprofile";
	}

    @RequestMapping("paymentstatus")
    public String paymentStatus() {
	 return "paymentstatus";
}
	
	@RequestMapping("/searchcustome")
	public String getCustomer(int customerid,Model m) {
	List <Confirm> c = ci.getByCustomerId(customerid);
	
	Confirm con = c.get(c.size()-1);
	
	
	
		
	
		
		m.addAttribute("name", con.name);
		m.addAttribute("ci", con.customerid);
		m.addAttribute("lty", con.loantype);
		m.addAttribute("st", con.status);
		m.addAttribute("la", con.loanamount);
		m.addAttribute("tp", con.totalpayble);
		m.addAttribute("ni", con.numberofmonths);
		m.addAttribute("col", con.collections);
		m.addAttribute("mr", con.remaingpayble);
		m.addAttribute("pay1", con.startpay);
		m.addAttribute("pay2", con.endpay);
		
		
		return "customerprofile";
	}
	
	@RequestMapping("/searchcustomerpay")
	public String getCustomerPayStatus(int customerid,Model m) {
	//List <Confirm> c = ci.getByCustomerId(customerid);
	
	
//   for(Confirm con:c) {
//		
//		m.addAttribute("paydate", con.lastpaydate);
//		m.addAttribute("lty", con.loantype);
//		m.addAttribute("mp", con.mothlypayble);
//		m.addAttribute("ec", con.extracharge);
//		m.addAttribute("tp", con.totalpayble);
//       }
	
	m.addAttribute("p", ci.getByCustomerId(customerid));
		return "paymentstatus";
	}
	
	
}
