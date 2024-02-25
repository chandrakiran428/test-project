package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Event;
import com.example.demo.entity.User;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EventRepository;

import java.util.List;

@Service
public class BookingService {

//    @Autowired
//    private BookingRepository bookingRepository;
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllBookings() {
        return eventRepository.findAll();
    }
    
    public List<Event> getNewBookings() {
        return eventRepository.findByStatus("pending");
    }
    
    public List<Event> getBookingHistory() {
        return eventRepository.findByStatus("done");
    }
    /* ------------------------------------------------------------------------ */
    @Autowired
    private CustomerRepository customerRepository;

    public User findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public User save(User user) {
        return customerRepository.save(user);
    }
}

