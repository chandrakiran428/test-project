package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Event;
import com.example.demo.Entity.User;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Service.BookingService;

@Controller
@RequestMapping("/bookings")
public class BookingController {
 
	@Autowired
    private BookingService bookingService;
   
	 @Autowired
	  private  CustomerRepository CustomerRepository;
	
    @GetMapping
    public String getAllBookings(Model model) {
        List<Event> events = bookingService.getAllBookings();
        model.addAttribute("bookings", events);
        
        return "booking";
    }
   
	
}
