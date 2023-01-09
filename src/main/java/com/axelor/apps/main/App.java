package com.axelor.apps.main;

import com.axelor.apps.*;  
import javax.persistence.*;  
public class App {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
//Student s=em.find(Student.class,102);  
  //      System.out.println("Before Updation");  
    //    System.out.println("Student id = "+s.getS_id());  
      //  System.out.println("Student Name = "+s.getS_name());  
         
          
//s.setS_id(30);  
          
  //      System.out.println("After Updation");  
    //    System.out.println("Student id = "+s.getS_id());  
      //  System.out.println("Student Name = "+s.getS_name());  
         
        //  Student s1=em.find(Student.class,102);  
//em.remove(s);  
//em.getTransaction().commit();  
///emf.close();  
//em.close();  
   
          
        Student s1=new Student();  
        s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        
          
        Student s2=new Student();  
        s2.setS_id(102);  
        s2.setS_name("Ronit");  
          
          
        Student s3=new Student();  
        s3.setS_id(103);  
        s3.setS_name("Rahul");  
        
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
     Student s4=em.find(Student.class,101);  
          
        System.out.println("Student id = "+s4.getS_id());  
        System.out.println("Student Name = "+s4.getS_name());  
          
          
    }  
}  
