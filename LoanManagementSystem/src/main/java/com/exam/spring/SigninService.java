package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigninService {

	@Autowired
	private SigninInterface si;
	
	 	public void addsigin(Sigin su) {
			
			si.save(su);
		}
		public void updatesigin(Sigin su) {
			si.save(su);
		}
		public void deletesigin(Sigin su) {
			si.delete(su);
		}
		
		public Sigin signLoanById(int id) {
			return si.findById(id).get();
		}
		public List<Sigin> allsigin(){
			return si.findAll();
		}
		
}
