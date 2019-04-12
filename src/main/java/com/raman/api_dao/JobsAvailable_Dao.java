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
	public static List<JobsEntity> list = new ArrayList<JobsEntity>();//global list to store jobs
	public static List<JobsEntity> sr = new ArrayList<JobsEntity>(); //global list to store search result based on filter

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
		list.clear();
		list.add(getJobDetails_one());
		list.add(getJobDetails_two());
		return list;
	}

	public List<JobsEntity> getFilteredData(String filter) {	
		sr.clear();
		for(JobsEntity a: list){

			if(a.getCompany().equalsIgnoreCase(filter) || a.getDesignation().equalsIgnoreCase(filter) ||
					a.getEducation().equalsIgnoreCase(filter) || a.getIndustry().equalsIgnoreCase(filter) ||
					a.getExperience().equalsIgnoreCase(filter) || a.getJobType().equalsIgnoreCase(filter)||
					a.getLocation().equalsIgnoreCase(filter)|| a.getLocation().contains(filter)||
					a.getSalary().equalsIgnoreCase(filter)|| a.getSkills().equalsIgnoreCase(filter))
			{
				sr.add(a);
			}
		}
		System.out.println("number of search result: "+sr.size());
		return sr;
	}

	public JobsEntity createJob(JobsEntity a) {
		list.add(a);		
		return a;
	}

	public void updateJob(JobsEntity a) {
		int jobID = a.getJobId();
		for(JobsEntity e:list){
			if(e.getJobId()==jobID){
				e.setCompany(a.getCompany());
				e.setDesignation(a.getDesignation());
				e.setEducation(a.getEducation());
				e.setExperience(a.getExperience());
				e.setIndustry(a.getIndustry());
				e.setJobId(jobID);
				e.setJobType(a.getJobType());
				e.setLocation(a.getLocation());
				e.setSalary(a.getSalary());
				e.setSkills(a.getSkills());
				System.out.println("updated");
				list.remove(e);
				list.add(e);

				return;
			}
		}
		createJob(a);
		System.out.println("created as new job");		
	}

	public JobsEntity deleteJob(int id) {
		for(JobsEntity e:list){
			if(e.getJobId()==id){
				list.remove(e);
				return e;
			}
		}
		return null;
	}

}
