package com.mcs.be.course.service;

import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.model.Article;

import java.util.List;

public interface UserService 
{
   
	  List<User> retrieveAllUsers();
	
    User register(User user);
    
    User login(String id, String password);
  
    

}
