package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface CustomerRepository extends JpaRepository<User, Long> {
	    User findByUsername(String username);

		//User findByName(String username);


		//User getUserByName(String username);



		

	

}
