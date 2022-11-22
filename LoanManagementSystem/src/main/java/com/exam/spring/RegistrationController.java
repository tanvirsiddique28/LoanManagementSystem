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
public class RegistrationController {

	@Autowired
	private RegistrationService rs;
	
	
	
	@RequestMapping("/reg")
	public String showreg() {
		return "registration";
	}
	
	@RequestMapping("/reset")
	public String resetInput() {
		return "registration";
	}
	
	
	@RequestMapping("/register")
	public String registerInput(@ModelAttribute Registration r) {
		rs.addCustomer(r);
		return "registration";
	}
	
	
	@RequestMapping("/regtableview")
	public String showregtableView(Model m) {
		m.addAttribute("rr",rs.allCustomer());
		return "registrationtable";
	}

	@RequestMapping("/updatere")
	public String showdupdatereg() {
		return "rupdate";
	}
	
	@RequestMapping("/updatereg/{id}")
	public String updatereg(@PathVariable("id") int id, Model model) {
		Registration r= rs.registrationById(id);
        model.addAttribute("l", r);
		return "rupdate";
	}
	@RequestMapping("/updater")
	public String update(@ModelAttribute Registration r, Model model) {
		rs.updateCustomer(r);
		model.addAttribute("rr", rs.allCustomer());
		return "registrationtable";
	}
	
	
	@RequestMapping("/deletereg/{id}")
	public String deletereg(@PathVariable("id") int id, Model m) {
		Registration r= rs.registrationById(id);
		rs.deleteCustomer(r);
		m.addAttribute("rr", rs.allCustomer());
		return "registrationtable";
	}
	
	@RequestMapping("/searchregitem")
	public String m2(@RequestParam int id,Model m) {
		List<Registration> st =new ArrayList<>();
		st.add(rs.registrationById(id));
		m.addAttribute("rr", st);
		return "registrationtable";
	}
}
