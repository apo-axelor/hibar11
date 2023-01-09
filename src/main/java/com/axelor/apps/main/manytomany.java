package com.axelor.apps.main;



import java.util.ArrayList;

import javax.persistence.*;  

import com.axelor.apps.Stud;
import com.axelor.apps.lib;  
  
  
public class manytomany {  
      
    public static void main(String[] args) {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("books_issued");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        Stud st1=new Stud(1,"Vipul",null);  
        Stud st2=new Stud(2,"Vimal",null);  
          
        em.persist(st1);  
        em.persist(st2);  
          
          
        ArrayList<Stud> al1=new ArrayList<Stud>();  
    ArrayList<Stud> al2=new ArrayList<Stud>();  
          
        al1.add(st1);  
        al1.add(st2);  
          
        al2.add(st1);  
        al2.add(st2);  
          
        lib lib1=new lib(101,"Data Structure",al1);  
        lib lib2=new lib(102,"DBMS",al2);  
          
          
        em.persist(lib1);  
        em.persist(lib2);  
          
        em.getTransaction().commit();  
        em.close();  
        emf.close();  
          
    }  
  
}  
