package com.baeldung.multipledb.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class TicketDao {
	
	@Autowired
	private EntityManager em;
	
	
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfo(){
		
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}
	

	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfoByCategory(String input){
		
		return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("tcategory", input).getResultList();
	}
}
