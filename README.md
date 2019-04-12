# rest-api
rest api creation in Java. *data are static in this project


GET:

http://localhost:8082/rest-api/webapi/jobs/alljobs

http://localhost:8082/rest-api/webapi/jobs/filter/{searchkeyword}

POST:
http://localhost:8082/rest-api/webapi/jobs/addjob -- add new job object verify by calling filter api for common attribute 

post body: can be JSON or XML

{
"company": "v-bank",
"designation": "network engineer",
"education": "computer science engineering or equivalent",
"experience": ">5 years",
"industry": "IT",
"jobId": 4,
"jobType": "full time",
"location": "bangalore",
"salary": "23 lakhs - 30 lakhs",
"skills": "computer, science, degree"
}

