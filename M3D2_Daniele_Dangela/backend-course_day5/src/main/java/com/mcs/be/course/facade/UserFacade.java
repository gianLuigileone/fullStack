package com.mcs.be.course.facade;

import com.mcs.be.course.model.Customer;

public interface UserFacade {
	public Customer login(String id, String password);
	public Customer register(Customer customer);
}
