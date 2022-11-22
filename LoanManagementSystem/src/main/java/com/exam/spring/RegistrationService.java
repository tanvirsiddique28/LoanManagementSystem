package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

	@Autowired
	private RegistartionInterface ri;
	
	public void addCustomer(Registration r) {
		
		ri.save(r);
	}
	public void updateCustomer(Registration r) {
		ri.save(r);
	}
	public void deleteCustomer(Registration r) {
		ri.delete(r);
	}
	
	public Registration registrationById(int id) {
		return ri.findById(id).get();
	}
	public List<Registration> allCustomer(){
		return ri.findAll();
	}
}
