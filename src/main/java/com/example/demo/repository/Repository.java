package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.User;


public interface Repository extends CrudRepository<User, Integer>{

}