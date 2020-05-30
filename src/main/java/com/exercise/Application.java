package com.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercise.model.Cases;
import com.exercise.model.Client;
import com.exercise.service.GenericService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	public GenericService gs;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Cases c = gs.getCase(new Long(20257058L));
		//System.out.println("CaseCin is :" + c.getCaseCin());

		//Plans p = gs.getPlan(new Long(63L));
		//System.out.println("PlanId is :" + p.getPlanIdExt());

		Client cl = gs.getClient(new Long(25985027L));

		if(null == cl) {
			System.out.println("Client is null");
		}else {
			System.out.println("Client Name is :" + cl.getClntFname() + " " + cl.getClntLname());
		}
	}

	public GenericService getGs() {
		return gs;
	}

	public void setGs(GenericService gs) {
		this.gs = gs;
	}

}
