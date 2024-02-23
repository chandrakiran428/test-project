package com.ManagerDemo.service;

import java.util.List;

import com.ManagerDemo.entity.VenueList;



public interface VenueListService {
	public List<VenueList> getAllVenueList();

	VenueList saveVenue(VenueList venues);
}
