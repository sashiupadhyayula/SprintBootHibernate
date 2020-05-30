package com.exercise.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exercise.model.Cases;

@Repository
public interface CaseDao extends CrudRepository<Cases, Long> {

	public Cases findByCaseId(Long caseId);


}
