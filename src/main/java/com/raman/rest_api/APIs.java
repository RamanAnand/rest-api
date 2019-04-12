package com.raman.rest_api;

/*
 * this class will have rest APIs implementations
 * GET:
 * http://www.localhost:8083/jersey_static_data/webapi/jobs/tcs
 * http://www.localhost:8083/jersey_static_data/webapi/jobs/infosys
 * http://www.localhost:8083/jersey_static_data/webapi/jobs/alljobs
 * 
 * POST:
 * 
 *  Author: RAMAN ANAND
 */

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.raman.api_dao.JobsAvailable_Dao;
import com.raman.model.JobsEntity;


@Path("jobs")
public class APIs {

	JobsAvailable_Dao jDao = new JobsAvailable_Dao();
	List<JobsEntity> list;

	@GET
	@Path("alljobs")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<JobsEntity> getJobsDetail(){
		list = jDao.getJobsDetail();		
		return list;
	}
	
	@GET
	@Path("filter/{value}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<JobsEntity> getFilteredData(@PathParam("value") String filter ){
		list = jDao.getFilteredData(filter);
		System.out.println("Filter data on: "+filter);
		return list;
		
	}
	
	@POST
	@Path("addjob")
	public void addJobs(JobsEntity a){
		jDao.addJobs(a);
		System.out.println("adding:\n"+a.toString());
	}
	

}