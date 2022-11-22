package com.exam.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

	@Autowired
	private DataInterface di;
	
	public void addData(Data d) {
		di.save(d);
	}
	
	
	public void updateData(Data d) {
		di.save(d);
	}
	public void deleteData(Data d) {
		di.delete(d);
	}
	
	public Data dataById(int id) {
		return di.findById(id).get();
	}
	
	
	public List<Data> allData(){
		
		return di.findAll();
			
		}
}
