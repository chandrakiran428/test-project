package com.ManagerDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManagerDemo.entity.VenueList;

public interface VenueListRepo  extends JpaRepository<VenueList, Long> {
	

}
