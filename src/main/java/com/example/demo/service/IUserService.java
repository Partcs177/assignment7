package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.Repository;
import com.example.entity.User;



@Service
public class IUserService {
	@Autowired 
	Repository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
	}

	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}

}