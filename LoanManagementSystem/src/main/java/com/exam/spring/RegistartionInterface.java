package com.exam.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistartionInterface extends JpaRepository<Registration, Integer> {
	
	@Query("select count(u.id) From Registration u")
	public long getNumberOfCustomer();
	
	

}
