package com.ManagerDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManagerDemo.entity.VenueList;
import com.ManagerDemo.repository.VenueListRepo;
import com.ManagerDemo.service.VenueListService;


@Service
public class VenueListServiceImpl implements VenueListService {

	@Autowired
	private VenueListRepo venuelistrepo;
	
	
	

	public List<VenueList> getAllVenueList() {
		// TODO Auto-generated method stub
		return venuelistrepo.findAll();
	}




	@Override
	public VenueList saveVenue(VenueList venues) {
		// TODO Auto-generated method stub
		return venuelistrepo.save(venues);
	}

}
