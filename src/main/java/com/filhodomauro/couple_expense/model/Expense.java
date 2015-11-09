package com.filhodomauro.couple_expense.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * 
 * @author maurofilho
 *
 */
public class Expense {

	private String name;
	private BigDecimal value;
	private LocalDate dueDate;
	private LocalDate creationDate;
	private User owner;
	private List<UserFraction> fractions;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public List<UserFraction> getFractions() {
		return fractions;
	}
	public void setFractions(List<UserFraction> fractions) {
		this.fractions = fractions;
	}
}
