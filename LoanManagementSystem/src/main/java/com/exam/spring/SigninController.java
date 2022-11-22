package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SigninController {
	
	@Autowired
	private SigninService ss;
	
	@Autowired
	private SigninInterface si;
	
	@Autowired
	public DataInterface di;
	
	@Autowired
	public RegistartionInterface ri;
	
	@Autowired
	public ApplyInterface ai;
	
	@Autowired
	public ConfirmInterface ci;

	
	
	
	@RequestMapping("/logup")
	public String showlogup() {
		return "logup";
	}
	
	@RequestMapping("/logupinsert")
	public String showlogupInsert(@ModelAttribute Sigin s,Model m) {
		ss.addsigin(s);
		
		return "logup";
	}
	
	@RequestMapping("/login")
	public String showlogin() {
		return "login";
	}
	
	String status = "approved";
	String status2 = "not approved";
	String status3 = "Dismissed";
	
	@RequestMapping("/dashboard")
	public String showdashboard(@RequestParam String username,@RequestParam String password,Model m) {
		
		List<Sigin> list = si.getUserByName(username);
	
		for(Sigin sig: list) {
			 if(sig.username.matches(username) && sig.password.matches(password)) {
				 m.addAttribute("allLonaType", di.getNumberOfLoanType());
					m.addAttribute("allCustomers", ri.getNumberOfCustomer());
					m.addAttribute("allApplicants", ai.getNumberOfApplicants());
					m.addAttribute("allAppLoans", ai.getNumberOfAppLoans(status));
					m.addAttribute("allNotAppLoans", ai.getNumberOfNotAppLoans(status2));
					m.addAttribute("allDissLoans", ci.getNumberOfDissLoans(status3));
				 
				 
				return "dashboard";
			    }else if(username.isEmpty() && password.isEmpty()) {
				String warning1 = "username and password is empty";
				m.addAttribute("warn", warning1);
				return "login";
				}else {
			    String warning2 = "username and password is wrong";
				m.addAttribute("warn", warning2);
			    return "login";
		       }
		
	}
	
		 return "login";
	}

}
