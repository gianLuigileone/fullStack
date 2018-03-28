package com.mcs.be.course.facade;

public interface UserFacade {
	public User login(String id, String password);
	public User register(User user);
}
