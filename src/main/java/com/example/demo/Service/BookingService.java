package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Event;
import com.example.demo.Entity.User;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.EventRepository;

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
    
    @Autowired
    private CustomerRepository customerRepository;

    public User findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public User save(User user) {
        return customerRepository.save(user);
    }
}

