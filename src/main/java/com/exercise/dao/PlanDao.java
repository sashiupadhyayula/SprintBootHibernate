package com.exercise.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exercise.model.Plans;

@Repository
public interface PlanDao extends CrudRepository<Plans, Long> {

	public List<Plans> findByPlanId(Long planId);
	
}
