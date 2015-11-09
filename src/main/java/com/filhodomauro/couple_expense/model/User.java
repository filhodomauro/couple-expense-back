package com.filhodomauro.couple_expense.model;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author maurofilho
 *
 */
public class User {
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String email;
	private User partner;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getPartner() {
		return partner;
	}
	public void setPartner(User partner) {
		this.partner = partner;
	}
}
