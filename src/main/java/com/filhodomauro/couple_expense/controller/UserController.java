package com.filhodomauro.couple_expense.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.filhodomauro.couple_expense.exception.EntityValidationException;
import com.filhodomauro.couple_expense.model.User;
import com.filhodomauro.couple_expense.repository.UserRepository;

/**
 * 
 * @author maurofilho
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public ResponseEntity<User> save(@RequestBody @Valid User user, BindingResult result){
		if(result.hasErrors()){
			throw new EntityValidationException(ControllerHelper.getErrorMessage(result));
		}
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@RequestMapping( value = "/user", method = RequestMethod.GET)
	public String list(){
		return "teste";
	}
}
