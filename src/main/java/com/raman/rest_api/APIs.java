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
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.raman.api_dao.JobsAvailable_Dao;
import com.raman.model.JobsEntity;



@Path("jobs")
public class APIs {

	JobsAvailable_Dao jDao = new JobsAvailable_Dao();

	@GET
	@Path("blockchain")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public JobsEntity getJobDetails_one(){		
		JobsEntity tcs = jDao.getJobDetails_one();
		return tcs;

	}

	@GET
	@Path("java")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public JobsEntity getJobDetails_two(){		
		JobsEntity infosys = jDao.getJobDetails_two();		
		return infosys;

	}

	@GET
	@Path("alljobs")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<JobsEntity> getJobsDetail(){
		List<JobsEntity> list = jDao.getJobsDetail();		
		return list;
	}

}