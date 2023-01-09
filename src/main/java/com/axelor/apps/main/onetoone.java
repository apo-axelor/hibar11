  
package com.axelor.apps.main;
import javax.persistence.*;

import com.axelor.apps.Library;
import com.axelor.apps.S1;
import com.axelor.apps.Student;  

public class onetoone {
	  public static void main(String[] args) {  
          
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Book_issued" );  
	           EntityManager em = emf.createEntityManager( );  
	           em.getTransaction( ).begin( );  
	          
	           S1 st1=new S1();  
	           st1.setS_id(1);  
	           st1.setS_name("Vipul");  
	             
	           S1 st2=new S1();  
	           st2.setS_id(2);  
	           st2.setS_name("Vimal");  
	             
	             
	           em.persist(st1);  
	           em.persist(st2);  
	             
	           Library lib1=new Library();  
	           lib1.setB_id(101);  
	           lib1.setB_name("Data Structure");  
	           lib1.setStud(st1);  
	             
	           Library lib2=new Library();  
	           lib2.setB_id(102);  
	           lib2.setB_name("DBMS");  
	           lib2.setStud(st2);  
	             
	           em.persist(lib1);  
	           em.persist(lib2);  
	             
	           em.getTransaction().commit();  
	             
	           em.close();  
	           emf.close();  
	    }  
	      
	      
	} 
