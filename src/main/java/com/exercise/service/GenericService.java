package com.exercise.service;

import org.springframework.stereotype.Service;

import com.exercise.model.Cases;
import com.exercise.model.Client;
import com.exercise.model.Plans;

@Service
public interface GenericService {
	public Cases getCase(Long caseId);

	public Client getClient(Long clientId);

	public Plans getPlan(Long planId);
}
