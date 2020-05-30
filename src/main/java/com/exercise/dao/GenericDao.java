package com.exercise.dao;

import org.springframework.stereotype.Repository;

import com.exercise.model.Client;

@Repository
public interface GenericDao {


	public Client getClientEntity(Long id) ;

}
