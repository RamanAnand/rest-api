package com.raman.rest_api;

/*
 * this class will have rest APIs implementations
 * GET:
 * http://localhost:8082/rest-api/webapi/jobs/alljobs
 * http://localhost:8082/rest-api/webapi/jobs/filter/{searchkeyword}
 * 
 * POST:
 * http://localhost:8082/rest-api/webapi/jobs/addjob
 * 
 *  Author: RAMAN ANAND
 */

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
		System.out.println("/alljobs called - GET request");
		list = jDao.getJobsDetail();		
		return list;
	}	
	
	@POST
	@Path("alljobs")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public JobsEntity createJob(JobsEntity a){
		JobsEntity a1 = jDao.createJob(a);
		System.out.println("/alljobs called - POST request");
		return a1;
	}
	
	@PUT
	@Path("alljobs")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public JobsEntity updateJob(JobsEntity a){
		System.out.println("/alljobs called - PUT/Update request");
		jDao.updateJob(a);
		return a;
	}	

	@GET
	@Path("alljobs/{value}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<JobsEntity> getFilteredData(@PathParam("value") String filter ){
		list = jDao.getFilteredData(filter);
		System.out.println("/alljobs/{value} called: search value= "+filter);
		return list;		
	}
	
	@DELETE
	@Path("alljobs/{id}")
//	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public JobsEntity deleteJob(@PathParam("id") int id){
		JobsEntity e = jDao.deleteJob(id);
		return e;
		
	}
	
	

}