package com.raman.api_dao;


/*
 * this class will provide data to the APIs
 * in this project we are having static data 
 * later we will connect to database to fetch data
 *
 *  Author: RAMAN ANAND
 */


import java.util.ArrayList;
import java.util.List;

import com.raman.model.JobsEntity;

public class JobsAvailable_Dao {
	
	public JobsEntity getJobDetails_one(){
		JobsEntity jobOne = new JobsEntity();
		jobOne.setCompany("TPS");
		jobOne.setDesignation("ASE");
		jobOne.setEducation("BE, Bsc, Msc, B Tech, BCA");
		jobOne.setExperience("Fresher or <1 years");
		jobOne.setIndustry("IT");
		jobOne.setJobId(1);
		jobOne.setJobType("full time, blockchain developer");
		jobOne.setLocation("bangalore, chennai, kolkata");
		jobOne.setSalary("<3 lakhs");
		jobOne.setSkills("");

		return jobOne;
	}

	public JobsEntity getJobDetails_two(){
		JobsEntity jobOne = new JobsEntity();
		jobOne.setCompany("Infosis");
		jobOne.setDesignation("OE - Operational engineer");
		jobOne.setEducation("BCA, B Sc");
		jobOne.setExperience("Fresher");
		jobOne.setIndustry("IT");
		jobOne.setJobId(2);
		jobOne.setJobType("full time");
		jobOne.setLocation("bangalore");
		jobOne.setSalary("2 lakhs");
		jobOne.setSkills("computer science degree");

		return jobOne;

	}

	public List<JobsEntity> getJobsDetail(){
		List<JobsEntity> jobList = new ArrayList<JobsEntity>(); 		
		jobList.add(getJobDetails_one());
		jobList.add(getJobDetails_two());

		return jobList;
	}

}
