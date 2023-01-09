package com.axelor.apps;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.axelor.apps.Library;

@Entity  
public class Stud {  
  
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int s_id;  
    private String s_name;  
      
    @ManyToMany(targetEntity=lib.class)  
    private List lib;  
      
      
      
    public Stud(int s_id, String s_name, List lib) {  
        super();  
        this.s_id = s_id;  
        this.s_name = s_name;  
        this.lib = lib;  
    }  
      
      
      
    public Stud() {  
        super();  
        // TODO Auto-generated constructor stub  
    }  
  
  
  
    public List getLib() {  
        return lib;  
    }  
    public void ListLib(List lib) {  
        this.lib = lib;  
    }  
    public int getS_id() {  
        return s_id;  
    }  
    public void ListS_id(int s_id) {  
        this.s_id = s_id;  
    }  
    public String getS_name() {  
        return s_name;  
    }  
    public void ListS_name(String s_name) {  
        this.s_name = s_name;  
    }  
    }  
