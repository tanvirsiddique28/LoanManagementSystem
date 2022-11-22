package com.exam.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmInterface extends JpaRepository<Confirm, Integer> {
	
	@Query("select u From Confirm u WHERE u.customerid =:n ")
	public List<Confirm> getByCustomerId(@Param("n")int customerid);
	
	@Query("SELECT u From Confirm u ")
    public List<Confirm> getMaxDate();
	
	
	@Query("select count(u.id) From Confirm u WHERE u.status =:n  ")
	public long getNumberOfDissLoans(@Param("n") String status3);
	
	@Query("select u From Confirm u WHERE u.status =:n  ")
	public List<Confirm> getNumberOfDissLoansValue(@Param("n") String status3);
	
//	@Query("SELECT u From Confirm u ORDER BY u.collections DESC ")
//	public List<Confirm> getMaxLoan();
//	
//	
	
	
	// @Query(value = "SELECT * FROM students ORDER BY id DESC LIMIT 1", nativeQuery = true) Object getLastStudentDetails();
	
//	@Query("select u From Confirm u WHERE u.customerid = :n and max(u.loanamount)")
//	public long  getByCustomerloan(@Param("n")int customerid);
	
//	@Query("select max(u.loanamount) From Confirm u WHERE u.customerid =:n ")
//	public long getByCustomerloan(@Param("n")int customerid);
	
//	 @Query("SELECT DISTINCT u.collections From Confirm u WHERE u.customerid = :n")
//	 public long getByCustomerloan(@Param("n")int customerid);
	
//	@Query(value = "SELECT MAX(collections) FROM Confirm ", nativeQuery = true)
//	public long getMaxLoan();
	
}
