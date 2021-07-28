package com.spring.jpa.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
//	@Query("Select u from User u WHERE u.user_name=:n ")
//	public List<User> getByUserName(@Param("n") String user_name);

}
