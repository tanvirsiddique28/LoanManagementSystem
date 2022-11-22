package com.exam.spring;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;




@Service
public class PaymentService {

	@Autowired
	private ConfirmService cs;
	
	@Autowired
	private ConfirmInterface ci;
	
	@Autowired
	private ConfirmAddition ca;
	
	@Autowired
	private WithdrawnService ws;
	
	public void getCustomer(int customerid,Model m) {
		 
		List <Confirm> c = ci.getByCustomerId(customerid);
		
		Confirm con = c.get(c.size()-1);
		
		
		
			
			String name = con.name;
			double tp = con.totalpayble;
			double rp = con.remaingpayble;
			double cp = con.mothlypayble;
			String da = con.endpay;
			
			m.addAttribute("name", name);
			m.addAttribute("tp", tp);
			m.addAttribute("rp", rp);
			m.addAttribute("cp", cp);
			m.addAttribute("da", da);
			
			m.addAttribute("customerid", con.customerid);
			
			
		
		
		
	}
	
	public void customerPay(int customerid,double payment,double extracharge,Model m) {
		
		List <Confirm> c = ci.getByCustomerId(customerid);
		
		Confirm con = c.get(c.size()-1);
		
      
			

			
			//calculation1
		  double ec = con.extracharge+extracharge;
			
			//endpaymentdatee
			String epay = con.endpay;
			LocalDate lastdate = LocalDate.parse(epay);
			
			
			//calculation2
			double collect = con.collections+payment;
			double rp = con.remaingpayble-payment  ;
			int mr = con.remainingmonths-1;
			
			
			
			//date calculation and conversion
			 LocalDate date = LocalDate.now();
			 LocalDate stp = date.plusDays(30);
			 LocalDate etp = stp.plusDays(5);
			 
			 String astrDate = date.toString();
			 String sstrDate = stp.toString(); 
			 String estrDate = etp.toString(); 
			 
			 
			 //extracharge condition calculation
			 
			 double echarge = payment*0.05;
			 
			 if(con.remaingpayble-payment == 0) {
				 ws.WithdrawnPay(customerid, payment, m);
				 
			 }else {
			
			if(payment < con.mothlypayble) {
				String msg = "# You have to pay exact current amount";
				m.addAttribute("warn", msg);
			}else if(lastdate.compareTo(date)<1 && extracharge < 1 ) {
				String msg = "# You have to pay 5% extra charge on current payment as late fee which is  ";
				m.addAttribute("warn", msg+echarge);
			
			}else if(lastdate.compareTo(date)<1 && extracharge < echarge) {
				String msg = "# You have to pay 5% extra charge on current payment as late fee which is  ";
				m.addAttribute("warn", msg+echarge);
			}
			else {
				
			   Confirm confirm = new Confirm();
			   
			   //basci data
			   confirm.setCustomerid(con.customerid);
			   confirm.setName(con.name);
			   confirm.setLoantype(con.loantype);
			   confirm.setLoanamount(con.loanamount);
			   confirm.setMothlypayble(con.mothlypayble);
			   confirm.setNumberofmonths(con.numberofmonths);
			   confirm.setTotalpayble(con.totalpayble);
			   
			   confirm.setExtracharge(ec);
			   
			   //dates
			   confirm.setApprovaldate(con.approvaldate);
			   confirm.setStartpay(sstrDate);
			   confirm.setEndpay(estrDate);
			   
			   
			   //basic
			   confirm.setCollections(collect);
			   confirm.setRemaingpayble(rp);
			   confirm.setRemainingmonths(mr);
			   
			   confirm.setLastpaydate(astrDate);
			   confirm.setStatus("Running");
			   
			   cs.addApploans(confirm);
				
			   String msg = "# Payment successful!!!";
			   ca.getLatesttDate(m);
			   m.addAttribute("warn2", msg);
				
			}
			
			   
		    
			 }
			
		
		
		
	}
}
