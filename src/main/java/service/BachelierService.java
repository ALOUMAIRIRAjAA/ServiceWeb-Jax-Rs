package service;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Entity.bachelier;
import dao.bachelierdao;

@Path("/bachelier")
public class BachelierService {
	
	@GET
	@Path("/isaccepter/{cin}/{numero}")
	@Produces(MediaType.TEXT_PLAIN)
	public String isAcceptedBachelier(@PathParam("cin") String cin,@PathParam("numero") String numero) {
		bachelierdao bachelier=new bachelierdao();
		if(bachelier.isAccepted(cin, numero))
			return "accepte";
		else
			return "Non accepte";
			
	}
	

	@GET
	@Path("/get/{cin}/{numero}")
	@Produces(MediaType.APPLICATION_XML)
	public bachelier getBachelier(@PathParam("cin") String cin,@PathParam("numero") String numero) {
		bachelierdao bachelier=new bachelierdao();
		
			return bachelier.getBachelier(cin, numero);
		

	}
	
	
	@GET
	@Path("/isInscrits/{cin}/{numero}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBachelierBachelier(@PathParam("cin") String cin,@PathParam("numero") String numero) {
		bachelierdao bachelier=new bachelierdao();
		if (bachelier.getBachelier(cin, numero) != null)
			return "inscrit";
		else
			return "Non inscrit";
			
	}
	
	@GET
	@Path("/isCandidats/{cin}/{numero}")
	@Produces(MediaType.TEXT_PLAIN)
	public String isCandidatBachelier(@PathParam("cin") String cin,@PathParam("numero") String numero) {
		bachelierdao bachelier=new bachelierdao();
		if (bachelier.isCandidat(cin, numero))
			return "Candidat";
		else
			return "Non Candidat";
		
		
			
	}
	
	@GET
	@Path("/Update/{cin}/{numero}")
	@Produces(MediaType.TEXT_PLAIN)
	public String UpdateBachelier(@PathParam("cin") String cin,@PathParam("numero") String numero) {
		bachelierdao bachelier=new bachelierdao();
		if (bachelier.Update(cin, numero))
			
			return "fini";
		else
			return "cheque";
		
		
			
	}
	

}
