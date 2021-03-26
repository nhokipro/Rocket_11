package com.vti.entity;
public class Department{
    private int id;
    private String name;
    private Department(){
    	
    }
    Department(int id, String name){
    	this.id = 0;
    	this.name = name;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public int getId(int id) {
    	return id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getName(String name) {
    	return name;
    }
}