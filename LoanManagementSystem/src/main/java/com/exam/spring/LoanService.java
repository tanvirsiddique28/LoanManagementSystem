package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class LoanService {

	@Autowired
	private LoanInterface li;
	
	@Autowired
	private DataInterface di;
	
	public void addLoan(Loan l) {
		
		li.save(l);
	}
	public void updateLoan(Loan l) {
		li.save(l);
	}
	public void deleteLoan(Loan l) {
		li.delete(l);
	}
	
	public Loan loantById(int id) {
		return li.findById(id).get();
	}
	public List<Loan> allLoan(){
		return li.findAll();
	}
	
	
	public void loanCalculation(String loantype,double amount,int months,Model m) {
		
		List<Data> list = di.getLoanType(loantype);
		
		for(Data d:list) {
			if(loantype.equals(d.loantype)) {
				 if(amount < d.minamount ||amount > d.maxamount || months < d.minmonths || months > d.maxmonths   ){
			          String warn1 = "Amount must be from "; 
			          double warn2 = d.minamount;
			          String warn3 = " to ";
			          double warn4 = d.maxamount;
			          String warn5 = " and number of installment are from ";
			          int warn6 = d.minmonths;
			          String warn7 = " to ";
			          int warn8 = d.maxmonths;
			          String warn9 = " months ";
			          m.addAttribute("amt", amount);
			          m.addAttribute("mon", months);
			          m.addAttribute("war", warn1+warn2+warn3+warn4+warn5+warn6+warn7+warn8+warn9);
			              }else{
			            	  int interestrate = d.interestrate;
			            	  double interestamt= (amount/100)*interestrate;
			            	  double totalamount = amount+interestamt;
			            	  double monamount = totalamount/months;
		            	 
			            	  m.addAttribute("loan", loantype);
			            	  m.addAttribute("amt", amount);
			            	  m.addAttribute("mon", months);
			            	  m.addAttribute("ir", interestrate);
			            	  m.addAttribute("iamt", interestamt);
			            	  m.addAttribute("monamt", monamount);
			            	  m.addAttribute("totamt", totalamount);
		            	 
			            }
				
			}
			
		
		
			}
	}
	
	public void getLeastLoan(Model m) {
		
		String s1 = "Print id: ";
		String s2 = "Loan type: ";
		String s3 = "Loan Amount: ";
		String s4 = "Number of Months: ";
		String s5 = "Interest Rate: ";
		String s6 = "Interest Amount: ";
		String s7 = "Monthly Payble: ";
		String s8 = "Total Payble: ";
		
		
  	  List <Loan> list = li.getMaxPrint();
  	  Loan l = list.get(list.size()-1);
  	  m.addAttribute("lid", s1+l.id);
  	  m.addAttribute("ltt", s2+l.loantype);
  	  m.addAttribute("la", s3+l.loanamount);
  	  m.addAttribute("lm", s4+l.numberofmonths);
  	  m.addAttribute("lir",s5+l.interestrate);
  	  m.addAttribute("lia", s6+l.interestamount);
  	  m.addAttribute("lmp", s7+l.monthlypayble);
  	  m.addAttribute("ltp", s8+l.totalypayble);
  	  
	}
}
