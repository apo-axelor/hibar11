package com.axelor.apps.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.apps.Book;
import com.axelor.apps.St;

public class Manytoone {

	public static void main(String[] args) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("books");  
         
	        EntityManager em=emf.createEntityManager();  
	          
	        em.getTransaction().begin();  
	          
	        Book lib=new Book();  
	        lib.setB_id(101);  
	        lib.setB_name("Data Structure");  
	          
	        em.persist(lib);  
	          
	        St st1=new St();  
	        st1.setS_id(1);  
	        st1.setS_name("Vipul");  
	       st1.setLib(lib);  
	      
	          
	        St st2=new St();  
	        st2.setS_id(2);  
	        st2.setS_name("Vimal");  
	        st2.setLib(lib);  
	          
	        em.persist(st1);;  
	        em.persist(st2);  
	          
	          
	        em.getTransaction().commit();  
	        em.close();  
	        emf.close();  
	          
	    }  
	      
	

	}


