package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface CustomerRepository extends JpaRepository<User, Long> {
	    User findByUsername(String username);

		//User findByName(String username);


		//User getUserByName(String username);



		

	

}
