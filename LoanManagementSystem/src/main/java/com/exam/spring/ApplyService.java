package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyService {

	@Autowired
	private ApplyInterface ai;
	
    public void addApplyLoan(Applyloan al) {
		
		ai.save(al);
	}
	public void updateApplyLoan(Applyloan al) {
		ai.save(al);
	}
	public void deleteApplyLoan(Applyloan al) {
		ai.delete(al);
	}
	
	public Applyloan applyLoanById(int id) {
		return ai.findById(id).get();
	}
	public List<Applyloan> allapplyLoan(){
		return ai.findAll();
	}
	
}
