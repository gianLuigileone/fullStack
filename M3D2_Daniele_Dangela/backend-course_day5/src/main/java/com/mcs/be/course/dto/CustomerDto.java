package com.mcs.be.course.dto;

import java.io.Serializable;

public class CustomerDto implements Serializable {
	
	private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private String plot;
    private String tag;
    private Boolean like;
    
    public CustomerDto() {}
    
    
	public CustomerDto(Long id, String firstName, String lastName, String password, String plot, String tag, Boolean like) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password=password;
		this.plot = plot;
		this.tag = tag;
		this.like = like;
	}

	

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPlot() {
		return plot;
	}


	public void setPlot(String plot) {
		this.plot = plot;
	}


	public String getTag() {
		return tag;
	}


	public void setTag(String tag) {
		this.tag = tag;
	}


	public Boolean getLike() {
		return like;
	}


	public void setLike(Boolean like) {
		this.like = like;
	}
    
    
    

}
