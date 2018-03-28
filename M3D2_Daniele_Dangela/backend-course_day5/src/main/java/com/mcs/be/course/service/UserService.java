package com.mcs.be.course.service;

import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.model.Article;

import java.util.List;

public interface UserService 
{
   
	  List<Customer> retrieveAllUsers();
	
    Customer register(Customer user);
    
    Customer login(String id, String password);
  
    

}
