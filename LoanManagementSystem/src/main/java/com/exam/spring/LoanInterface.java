package com.exam.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanInterface extends JpaRepository<Loan, Integer> {

	@Query("select u From Loan u WHERE u.loantype =:n ")
	public List<Loan> getLoanType(@Param("n")String loantype);
	
	@Query("SELECT u From Loan u  ")
    public List<Loan> getMaxPrint();
}
