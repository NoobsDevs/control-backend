package com.control.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.control.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
