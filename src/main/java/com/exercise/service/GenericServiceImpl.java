package com.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.dao.CaseDao;
import com.exercise.dao.GenericDao;
import com.exercise.dao.PlanDao;
import com.exercise.model.Cases;
import com.exercise.model.Client;
import com.exercise.model.Plans;

@Service
public class GenericServiceImpl implements GenericService {

	@Autowired
	private CaseDao caseDao;
	@Autowired
	private PlanDao planDao;
	@Autowired
	private GenericDao genericDao;


	@Override
	public Cases getCase(Long caseId) {
		// TODO Auto-generated method stub
		Cases c = caseDao.findByCaseId(caseId);
		return c;
	}

	public Client getClient(Long clientId) {
		Client cl = genericDao.getClientEntity(clientId);
		return cl;
	}

	public Plans getPlan(Long planId) {
		List<Plans> p = planDao.findByPlanId(planId);
		return p.get(0);
	}

	public PlanDao getPlanDao() {
		return planDao;
	}

	public void setPlanDao(PlanDao planDao) {
		this.planDao = planDao;
	}

	public CaseDao getCaseDao() {
		return caseDao;
	}

	public void setCaseDao(CaseDao caseDao) {
		this.caseDao = caseDao;
	}

	public GenericDao getGenericDao() {
		return genericDao;
	}

	public void setGenericDao(GenericDao genericDao) {
		this.genericDao = genericDao;
	}
}
