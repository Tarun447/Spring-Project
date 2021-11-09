package com.beans;

public class Department {
private String name;
private int id;
private double sal;
public Department(String name,int id,double sal)
{
	this.name = name;
	this.id= id;
	this.sal = sal;
}
@Override
public String toString()
{
	return id+" " +name+ " "+sal;
}
}
