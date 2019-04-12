package com.raman.model;
/*
 * this class is the entity which will structure our data
 *  Author : RAMAN ANAND
 *  
 * XmlRootElement annotation specifies the root element in XML
 * <jobsAvailable_Entities>
		<jobsAvailableEntity>
		<companies>xxx</companies>
		<designation>xxx</designation>
		<education>xxx</education>
		<experience>xxx</experience>
		<industries>xxx</industries>
		<jobId>xxx</jobId>
		<jobType>xxx</jobType>
		<location>xxx</location>
		<salary>xxx</salary>
		<skills>xxx</skills>
	</jobsAvailableEntity>
 * 
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobsEntity {
	String skills, designation, company, location, experience, salary, industry, education, jobType;
	int jobId;

	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getIndustry() {
		return industry;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public String getJobType() {
		return jobType;
	}


	public void setJobType(String jobType) {
		this.jobType = jobType;
	}


	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	@Override
	public String toString() {
		return "JobsAvailable [skills=" + skills + ", designation="
				+ designation + ", companies=" + company + ", location="
				+ location + ", expirience=" + experience + ", salary="
				+ salary + ", industries=" + industry + ", education="
				+ education + ", jobType=" + jobType + ", jobId=" + jobId + "]";
	}	
}
