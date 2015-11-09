package com.filhodomauro.couple_expense.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;

/**
 * 
 * @author maurofilho
 *
 */
public class ControllerHelper {

	public static List<String> getErrorMessage(BindingResult result){
		final List<String> messages = new ArrayList<String>();
		if(result.getAllErrors() != null){
			result.getAllErrors().forEach( o -> messages.add(o.getDefaultMessage()));
		}
		return messages;
	}
}
