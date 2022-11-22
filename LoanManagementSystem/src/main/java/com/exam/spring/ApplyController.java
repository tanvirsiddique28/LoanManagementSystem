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
public class ApplyController {
	
	
	@Autowired
	private RegistrationService rs;

	@Autowired
    private LoanService ls;
	
	@Autowired
	private ApplyService as;
	
	@RequestMapping("/app")
	public String showapp() {
		return "applyloan";
	}
	
	@RequestMapping("/searchcustomer")
	public String getCustomer(@RequestParam int id,@RequestParam int pid,Model m) {
		List<Registration> st =new ArrayList<>();
		st.add(rs.registrationById(id));
		
	for(Registration r:st) {
		
		m.addAttribute("cid", r.id);
		m.addAttribute("name", r.name);
		m.addAttribute("nid", r.nid);
		m.addAttribute("age", r.age);
		
	}
		
		
		
		List<Loan> lt =new ArrayList<>();
  	    lt.add(ls.loantById(pid));
  	    
  	  for(Loan l:lt) {
  		m.addAttribute("ltp", l.loantype);
 	    m.addAttribute("la", l.loanamount);
 	    m.addAttribute("nm", l.numberofmonths);
 	    m.addAttribute("ir", l.interestrate);
 	    m.addAttribute("ia", l.interestamount);
 	    m.addAttribute("mp", l.monthlypayble);
	    m.addAttribute("tp", l.totalypayble);
  	  }
 	    
		 
		return "applyloan";
	}
	
	
	
	@RequestMapping("/applyl")
	public String addApplyLoan(@ModelAttribute Applyloan a ) {
		a.setStatus("pending");
		 as.addApplyLoan(a);
		return "applyloan";
	}
	
	@RequestMapping("/aplytableview")
	public String showapplytableView(Model m) {
		m.addAttribute("ll",as.allapplyLoan());
		return "applytable";
	}
	
	@RequestMapping("/updateap")
	public String showdupdateApp() {
		return "aupdate";
	}
	
	@RequestMapping("/updateapp/{id}")
	public String updateApp(@PathVariable("id") int id, Model model) {
		Applyloan a= as.applyLoanById(id);
        model.addAttribute("l", a);
		return "aupdate";
	}
	
	@RequestMapping("/updatea")
	public String update(@ModelAttribute Applyloan a, Model model) {
		as.updateApplyLoan(a);
		model.addAttribute("ll", as.allapplyLoan());
		return "applytable";
	}
	
	
	@RequestMapping("/deleteapp/{id}")
	public String deleteApp(@PathVariable("id") int id, Model m) {
		Applyloan a = as.applyLoanById(id);
		as.deleteApplyLoan(a);
		m.addAttribute("ll", as.allapplyLoan());
		return "applytable";
	}
	
	@RequestMapping("/searchapplicant")
	public String m2(@RequestParam int id,Model m) {
		List<Applyloan> st =new ArrayList<>();
		st.add(as.applyLoanById(id));
		m.addAttribute("ll", st);
		return "applytable";
	}

}
