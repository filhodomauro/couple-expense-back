package com.filhodomauro.couple_expense.model;

import java.math.BigDecimal;

/**
 * 
 * @author maurofilho
 *
 */
public class UserFraction {

	private User user;
	private BigDecimal fraction;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BigDecimal getFraction() {
		return fraction;
	}
	public void setFraction(BigDecimal fraction) {
		this.fraction = fraction;
	}
}
