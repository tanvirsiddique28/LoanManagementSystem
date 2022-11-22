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
public class ConfirmController {

	@Autowired
	private ApplyService as;
	
	@Autowired
	private ConfirmService cs;
	
	@Autowired
	private ConfirmInterface ci;
	
	@Autowired
	private ApplyInterface ai;
	
   @RequestMapping("/searchapploan")
   public String serApplicant(@RequestParam int customerid,Model m) {
	   
	   cs.conApp(customerid, m);

	   return "loanaproval";
   }
   
   @RequestMapping("/approve/{cid}")
   public String approveloan(@PathVariable("cid") int customerid, Model m) {
	   
	  
	   
	   cs.conApp(customerid, m);
	   cs.netIncome(customerid, m);
	   
	   
	   return "loanaproval";
   }
   
   @RequestMapping("/apptableview")
	public String showapplytableView(Model m) {
		m.addAttribute("ll",cs.allApploans());
		return "aprovedloans";
	}
   
   @RequestMapping("/updateappr/{id}")
	public String updateApp(@PathVariable("id") int id, Model model) {
	    Confirm c = cs.confirmById(id);
        model.addAttribute("l", c);
		return "apupdate";
	}
	
	@RequestMapping("/updateapr")
	public String update(@ModelAttribute Confirm c, Model model) {
		cs.updateApploans(c);
		model.addAttribute("ll", cs.allApploans());
		return "aprovedloans";
	}
   
   @RequestMapping("/deleteappr/{id}")
	public String deleteApp(@PathVariable("id") int id, Model m) {
		Confirm c = cs.confirmById(id);
		cs.deleteApploans(c);
		m.addAttribute("ll", cs.allApploans());
		return "aprovedloans";
	}
   
   @RequestMapping("/searchapploans")
	public String m4(@RequestParam int id,Model m) {
		List<Confirm> st =new ArrayList<>();
		st.add(cs.confirmById(id));
		m.addAttribute("ll", st);
		return "aprovedloans";
	}
   
   
   
}
