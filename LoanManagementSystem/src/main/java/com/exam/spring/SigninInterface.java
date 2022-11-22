package com.exam.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SigninInterface extends JpaRepository<Sigin, Integer> {
	
	@Query("select u From Sigin u WHERE u.username =:n ")
	public List<Sigin> getUserByName(@Param("n")String username);

}
