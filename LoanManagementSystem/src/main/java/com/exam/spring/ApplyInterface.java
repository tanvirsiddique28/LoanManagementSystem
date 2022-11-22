package com.exam.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyInterface extends JpaRepository<Applyloan, Integer> {

	@Query("select u From Applyloan u WHERE u.customerid =:n ")
	public Applyloan getByAppCustomerId(@Param("n")int customerid);

	@Query("select count(u.id) From Applyloan u")
	public long getNumberOfApplicants();
	
	@Query("select count(u.id) From Applyloan u WHERE u.status =:n  ")
	public long getNumberOfAppLoans(@Param("n") String status);
	
	@Query("select count(u.id) From Applyloan u WHERE u.status =:n  ")
	public long getNumberOfNotAppLoans(@Param("n") String status2);
	
	@Query("select u From Applyloan u WHERE u.status =:n  ")
	public List<Applyloan> getNumberOfPayments(@Param("n") String status4);
	
}
