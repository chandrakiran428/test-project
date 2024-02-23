package com.ManagerDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ManagerDemo.entity.VenueList;
import com.ManagerDemo.service.VenueListService;

@Controller
public class VenueListController {
	
	@Autowired
	private VenueListService venuelistservice;

	// Handler method to handle students
	@GetMapping("/VenueList")
	public String venulist(Model model) {
		model.addAttribute("Venues", venuelistservice.getAllVenueList());
		return "VenueList";
		
	}
	@GetMapping("/addvenue")
	public String addvenue(Model model) {
		VenueList venues = new VenueList();
		model.addAttribute("venue", venues);
		return "addvenue";
	}
	
	
	@PostMapping("/addvenue")
	public String saveVenue(@ModelAttribute("venues") VenueList venues) {
		venuelistservice.saveVenue(venues);
	    return "redirect:/index";
	}

}
