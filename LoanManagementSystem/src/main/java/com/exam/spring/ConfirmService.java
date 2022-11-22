package com.exam.spring;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ConfirmService {

	@Autowired
	private ApplyService as;
	
	@Autowired
	private ApplyInterface ai;
	
	@Autowired
	private ConfirmInterface ci;
	
	@Autowired
	private ConfirmAddition ca;
	
	@Autowired
	private DataInterface di;
	
	public void addApploans(Confirm c) {
		ci.save(c);
	}
	
	public void updateApploans(Confirm c) {
		ci.save(c);
	}
	
	
	public void deleteApploans(Confirm c) {
		ci.delete(c);
	}
	
	public Confirm confirmById(int id) {
		return ci.findById(id).get();
	}
	
	public List<Confirm> allApploans(){
		return ci.findAll();
	}
	
	
	//search customer
	public void conApp(@RequestParam int customerid,Model m) {
		
		 Applyloan al = ai.getByAppCustomerId(customerid);
		   
		  m.addAttribute("id", al.id);
		  m.addAttribute("cid", al.customerid);
		  m.addAttribute("cname", al.name);
		  m.addAttribute("cnid", al.nid);
		  m.addAttribute("cage", al.age);
		  m.addAttribute("ctin", al.tin);
		  m.addAttribute("cni", al.netincome);
		  m.addAttribute("gname", al.gurantor);
		  m.addAttribute("gnid", al.gurantornid);
		  m.addAttribute("ltt", al.loantype);
		  m.addAttribute("la", al.loanamount);
		  m.addAttribute("nm", al.months);
		  m.addAttribute("ir", al.interestrate);
		  m.addAttribute("ia", al.interestamount);
		  m.addAttribute("mp", al.monthlypayble);
		  m.addAttribute("tp", al.totalpayble);
		  m.addAttribute("st", al.status);
		
	}
	
	//age and net income
	public void netIncome(int customerid,Model m) {
		Applyloan al = ai.getByAppCustomerId(customerid);
		
		String loantype = al.loantype;
		List<Data> list = di.getLoanType(loantype);
		
		
		
		for(Data d:list) {
			
			
			String p = d.loantype;
			
			
			if(p.equals(al.loantype)) {
				
				
				   if( al.netincome>d.maxnetincome||al.netincome<d.minnetincome||al.age<d.minage) {
					  
					   String s1 = "minimum age limit is ";
					   int s2 = d.minage;
					   
					   String s3 = "maximum netincome is ";
					   double s4 =	d.maxnetincome;
					   String s5 = 	" and minimum netincome is ";
					   double s6 = d.minnetincome;
					   
					   m.addAttribute("s1", s1+s2);
					   m.addAttribute("s2", s3+s4+s5+s6);
					   al.setStatus("not approved");
					   as.updateApplyLoan(al);
					  
				   } else if( al.netincome<=d.maxnetincome||al.netincome>=d.minnetincome && al.age>=d.minage) {
					  
					   al.setStatus("approved");
					   as.updateApplyLoan(al);
					   ca.insertInCon(customerid, m);
					   ca.getLatesttDate(m);
					  
				   }
				   
				   
				}
			
			
			
			
		}
		
		
		   
	
	}
	
	
}
