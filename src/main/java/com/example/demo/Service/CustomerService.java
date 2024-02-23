package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.CustomerRepository;

@Service
public class CustomerService {

 @Autowired	
  private CustomerRepository CustomerRepository;
 
 
 public User updateUser(User user) {
     User existinguser = CustomerRepository.findById(user.getId()).orElse(null);
     existinguser.setUsername(user.getUsername());
     existinguser.setEmail(user.getEmail());
     existinguser.setAddress(user.getAddress());
     existinguser.setMobile(user.getMobile());
     return CustomerRepository.save(existinguser);
 }
 
 
}
