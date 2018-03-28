package com.mcs.be.course.service.impl;

import com.mcs.be.course.model.Customer;
import com.mcs.be.course.service.CustomerService;
import com.mcs.be.course.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private Customer CustomerDao;

    @Override
    public List<Customer> retrieveAllUsers() {
        return CustomerDao.findAll();
    }



	@Override
	public Customer register(Customer user) {
		 	Objects.requireNonNull(user.getId(), "id cannot be null");
	        Objects.requireNonNull(user.getFirstName(), "First name cannot be null");
	        Objects.requireNonNull(user.getLastName(), "Last name cannot be null");
	        Objects.requireNonNull(user.getPassword(), "Password cannot be null");
	        Objects.requireNonNull(user.getCartId(), "Cart cannot be null");
	        for(Customer userall:  retrieveAllUsers())
			{
				if(userall.getId().equals(user.getId()))
				{
					return user;
				}
			}
	        return CustomerDao.save(user);
	}

	@Override
	public Customer login(String id, String password) {
		for(Customer user:  retrieveAllUsers())
		{
			if(user.getId().equals(id)&& user.getPassword().equals(password))
			{
				return user;
			}
		}
		return null;
	}
}
