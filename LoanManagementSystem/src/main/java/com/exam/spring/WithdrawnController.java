package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WithdrawnController {

	@Autowired
	public ConfirmInterface ci;
	
	@Autowired
	private PaymentService ps;
	
	@Autowired
	private WithdrawnService ws;
	
	@RequestMapping("/searchwithdrawn")
	public String getWithdrawn(int customerid,Model m) {
	List <Confirm> c = ci.getByCustomerId(customerid);
	
	Confirm con = c.get(c.size()-1);
	
		m.addAttribute("rpay", con.remaingpayble);
		m.addAttribute("tp", con.totalpayble);
		m.addAttribute("customerid", con.customerid);
		
		
		return "withdrawn";
		
		
	}
	@RequestMapping("/witdrawn/{customerid}")
	public String setWithdrawn(@PathVariable int customerid,@RequestParam double payment,Model m) {
		
		ws.WithdrawnPay(customerid, payment, m);
		
		return "withdrawn";
	}
}
