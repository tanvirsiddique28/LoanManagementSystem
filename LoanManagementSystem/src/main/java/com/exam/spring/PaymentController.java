package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PaymentController {

	
	@Autowired
	private ConfirmService cs;
	
	@Autowired
	private ConfirmInterface ci;
	
	@Autowired
	private PaymentService ps;
	
	@RequestMapping("/payment")
	public String showpayment() {
		return "payment";
	}
	
	@RequestMapping("/searchappcus")
	public String getAppCustomer(@RequestParam int customerid,Model m) {
		 
		
			ps.getCustomer(customerid, m);
		
		
		
		
		//m.addAttribute("ml", ci.getMaxLoan());
		//m.addAttribute("mm", ci.getByCustomerloan(customerid));
		
		
		
	
		
		
		return "payment";
		
		
	}
	
	@RequestMapping("/calpay/{customerid}")
	public String calLoan(@PathVariable int customerid,@RequestParam double payment,@RequestParam double extracharge,Model m) {
		ps.getCustomer(customerid, m);
		ps.customerPay(customerid, payment,extracharge, m);
		
		return "payment";
	}
}
