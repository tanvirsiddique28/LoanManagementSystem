package com.exam.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DashBoardController {

	@Autowired
	public DataInterface di;
	
	@Autowired
	public RegistartionInterface ri;
	
	@Autowired
	public ApplyInterface ai;
	
	@Autowired
	public ConfirmInterface ci;
	
	String status = "approved";
	String status2 = "not approved";
	String status3 = "Dismissed";
	
	@RequestMapping("/showdashboard")
	    public String countAllLoanTypes( Model m) {
		m.addAttribute("allLonaType", di.getNumberOfLoanType());
		m.addAttribute("allCustomers", ri.getNumberOfCustomer());
		
		m.addAttribute("allApplicants",ai.getNumberOfApplicants());
		
		
		m.addAttribute("allAppLoans", ai.getNumberOfAppLoans(status));
		m.addAttribute("allNotAppLoans", ai.getNumberOfNotAppLoans(status2));
		m.addAttribute("allDissLoans", ci.getNumberOfDissLoans(status3));
		return "dashboard";
	}
	
	String status4 = "approved";
	@RequestMapping("/CollectionsPayments")
    public String getCollectionsPayments( Model m) {
	
		List<Applyloan> list = ai.getNumberOfPayments(status4);
		
		double sum = 0;
			for(Applyloan al:list) {
				 sum += al.loanamount;
				
				m.addAttribute("payments", sum);
				System.out.println(sum);
			}
			
			List <Confirm> li = ci.getNumberOfDissLoansValue(status3);
		
        	  
			double summ = 0;
			for(Confirm al:li) {
				 summ += al.collections;
				
				m.addAttribute("collections", summ);
				System.out.println(summ);
			}
        	
       
    
		
		
		
		
	
		
		
	return "allcollections";
}
}
