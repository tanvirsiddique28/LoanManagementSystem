package com.exam.spring;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class WithdrawnService {
	
	@Autowired
	private ConfirmInterface ci;
	
	@Autowired
	private ConfirmAddition ca;
	
	@Autowired
	private ConfirmService cs;

public void WithdrawnPay(int customerid,double payment,Model m) {
		
		List <Confirm> c = ci.getByCustomerId(customerid);
		
		Confirm con = c.get(c.size()-1);
		
      
			

			
			//calculation1
			int ec = 0;
			
			//endpaymentdatee
			String epay = con.endpay;
			
			
			
			//calculation2
			double collect = con.collections+payment;
			double rp = con.remaingpayble-payment  ;
			int mr = con.remainingmonths;
			
			
			
			//date calculation and conversion
			 LocalDate date = LocalDate.now();
			 
			 
			 String astrDate = date.toString();
			 
			 
			 
			 //extracharge condition calculation
			 
			 double echarge = 0;
			
			
				
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
			   
			   
			   
			   //basic
			   confirm.setCollections(collect);
			   confirm.setRemaingpayble(rp);
			   confirm.setRemainingmonths(mr);
			   
			   confirm.setLastpaydate(astrDate);
			   confirm.setStatus("Dismissed");
			   
			   cs.addApploans(confirm);
				
			   String msg = "# Payment successful!!! You have successfully paid all of your lending amount!!";
			   
			   m.addAttribute("warn2", msg);
				
			
		
	}
}
