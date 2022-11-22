package com.exam.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoanController {
	@Autowired
	private LoanService ls;
	
	@Autowired
	private LoanInterface li;
	
	@Autowired
	private DataService ds;
	
	
	
	@RequestMapping("/calview")
	public String showCalView(Model m) {
		m.addAttribute("loantypes", ds.allData() );
		return "calculation";
	}
	
	@RequestMapping("/caltu")
	public String loancal(
			@RequestParam String loantype,
			@RequestParam double amount, 
			@RequestParam int months, 
			Model m) {
		m.addAttribute("loantypes", ds.allData() );
		ls.loanCalculation(loantype, amount, months, m);
		return "calculation";
	}
	
	@RequestMapping("/save")
	public String saveLoan(
			
			@RequestParam String loan,
			@RequestParam double amount,
			@RequestParam int months,
			@RequestParam int intrate,
			@RequestParam double intamount,
			@RequestParam double monamount,
			@RequestParam double totalamount,
			
			Model m
			) {
		Loan lo = new Loan();
		lo.setLoantype(loan);
		lo.setLoanamount(amount);
		lo.setNumberofmonths(months);
		lo.setInterestrate(intrate);
		lo.setInterestamount(intamount);
		lo.setMonthlypayble(monamount);
		lo.setTotalypayble(totalamount);
		
		ls.addLoan(lo);
		
		m.addAttribute("loantypes", ds.allData() );
	
		  m.addAttribute("loan", loan);
    	  m.addAttribute("amt", amount);
    	  m.addAttribute("mon", months);
    	  m.addAttribute("ir", intrate);
    	  m.addAttribute("iamt", intamount);
    	  m.addAttribute("monamt", monamount);
    	  m.addAttribute("totamt", totalamount);
    	  
    	  //show print
    	 ls.getLeastLoan(m);
	 
		return "calculation";
	}
	

	@RequestMapping("/caltableview")
	public String showCalTableView(Model m) {
		m.addAttribute("ll",ls.allLoan());
		return "calculationtable";
	}
	
	@RequestMapping("/updatelo")
	public String showdupdateloan() {
		return "cupdate";
	}
	
	@RequestMapping("/updateloan/{id}")
	public String updateloan(@PathVariable("id") int id, Model model) {
		Loan l= ls.loantById(id);
        model.addAttribute("l", l);
		return "cupdate";
	}
	
	@RequestMapping("/updatel")
	public String update(@ModelAttribute Loan l, Model model) {
		ls.updateLoan(l);
		model.addAttribute("ll", ls.allLoan());
		return "calculationtable";
	}
	
	@RequestMapping("/deleteloan/{id}")
	public String deleteLoan(@PathVariable("id") int id, Model m) {
		Loan l= ls.loantById(id);
		ls.deleteLoan(l);
		m.addAttribute("ll", ls.allLoan());
		return "calculationtable";
	}
	
	
	
	
	@RequestMapping("/searchloanitem")
	public String m1(@RequestParam int id,Model m) {
		List<Loan> st =new ArrayList<>();
		st.add(ls.loantById(id));
		m.addAttribute("ll", st);
		return "calculationtable";
	}
	
	
	
	
}
