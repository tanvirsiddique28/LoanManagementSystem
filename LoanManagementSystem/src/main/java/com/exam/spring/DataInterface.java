package com.exam.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DataInterface extends JpaRepository<Data, Integer> {
	@Query("select u From Data u WHERE u.loantype =:n ")
	public List<Data> getLoanType(@Param("n")String loantype);
	
	@Query("select count(u.id) From Data u")
	public long getNumberOfLoanType();
	

}
