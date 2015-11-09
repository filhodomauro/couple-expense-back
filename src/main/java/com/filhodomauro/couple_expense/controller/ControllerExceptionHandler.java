package com.filhodomauro.couple_expense.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.filhodomauro.couple_expense.exception.EntityValidationException;

/**
 * 
 * @author maurofilho
 *
 */
@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(EntityValidationException.class)
	public ResponseEntity<List<String>> handleException(EntityValidationException ex){
		return new ResponseEntity<List<String>>(ex.getMessages(), HttpStatus.BAD_REQUEST);
	}
}
