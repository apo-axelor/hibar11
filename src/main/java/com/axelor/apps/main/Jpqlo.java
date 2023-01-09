
package com.axelor.apps.main;
import com.axelor.apps.StudentEntity;  
import javax.persistence.*;  
import java.util.*;  

public class Jpqlo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
          
        Query query = em.createQuery( "Select s from Ss ");  
        Query query1= em.createQuery( "update S SET s_age=25 where s_id>103");  
        Query query3 = em.createQuery( "delete from S where s_id=102");  
        
        query.executeUpdate();  
          
        @SuppressWarnings("unchecked")  
      List<StudentEntity> list=(List<StudentEntity>)query.getResultList( );  
         
        System.out.print("s_id");  
        System.out.print("\t s_name");  
       System.out.println("\t s_age");  
          
          
        for( StudentEntity s:list ){  
           System.out.print( s.getS_id( ));  
           System.out.print("\t" +  s.getS_name( ));  
          System.out.print("\t" + s.getS_age( ));  
          System.out.println();  
        }  
em.getTransaction().commit();  
        em.close();  
        emf.close();    
   }  
  

		// TODO Auto-generated method stub

	}


