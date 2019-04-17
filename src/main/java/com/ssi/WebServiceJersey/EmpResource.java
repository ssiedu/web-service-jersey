package com.ssi.WebServiceJersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("emp")
public class EmpResource {

	Emp e=new Emp(1111,"ABCD",50000);
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEmp() {
		String data=e.toString();
		return e.toString();
	}
	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public Emp getEmpJSON() {
		return e;
	}
	@GET
	@Path("xml")
	@Produces(MediaType.APPLICATION_XML)
	public Emp getEmpXML() {
		return e;
	}
}
