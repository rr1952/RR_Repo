package test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;

@Path("/hello")
public class Hello {

	@GET
	@Path("/t")
	@Produces(MediaType.TEXT_XML)
	public String helloXML( ) {
		String resources = "<?xml version='1.0' ?>" +
	"<hello> Hello. </hello>";
		return resources;
	}
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String helloHTML( ) {
		String resources = "<h1>Hello!</h1>";
		return resources;
	}
	
	// use @Param to take in inputs from last page
	// and upon successfully taking them, return the page saying successfully passed.
	@POST
	@Path("/test")
	@Produces(MediaType.TEXT_HTML)
	public String postHTML(@FormParam("username") String username, @FormParam("password") String password) {
		String resource = "<h1> Hello, " + username + "! </h1>" ;
		return resource;
	}
}
