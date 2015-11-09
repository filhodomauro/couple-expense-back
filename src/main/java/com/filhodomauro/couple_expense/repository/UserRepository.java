package com.filhodomauro.couple_expense.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filhodomauro.couple_expense.model.User;

/**
 * 
 * @author maurofilho
 *
 */
public interface UserRepository extends MongoRepository<User, String>{
}
