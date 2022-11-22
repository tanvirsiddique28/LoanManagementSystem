package com.exam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

	@Autowired
	private DataService ds;
	
	@RequestMapping("/dataview")
	public String dataView(Model m) {
		
		m.addAttribute("ll",ds.allData());
		return "data";
	}
	
	@RequestMapping("/datainsert")
	public String dataInsert(@ModelAttribute Data d,Model m) {
		ds.addData(d);
		m.addAttribute("ll",ds.allData());
		return "data";
	}
	
	@RequestMapping("/updatedata/{id}")
	public String updateloan(@PathVariable("id") int id, Model model) {
		Data l= ds.dataById(id);
        model.addAttribute("l", l);
		return "data";
	}
	
	@RequestMapping("/updated")
	public String update(@ModelAttribute Data l, Model model) {
		ds.updateData(l);
		model.addAttribute("ll", ds.allData());
		return "data";
	}
	
	
	
	
	@RequestMapping("/deletedata/{id}")
	public String deleteLoan(@PathVariable("id") int id, Model m) {
		Data l= ds.dataById(id);
		ds.deleteData(l);
		m.addAttribute("ll",ds.allData());
		return "data";
	}
	
	
	
}
