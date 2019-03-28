package com.imagniea.javaTraning;

public class Empolyee  extends Person{
String companyName;
	public Empolyee(String name, String gender, int age, String companyname)
	{
		super(name, gender, age);
		this.companyName=companyname;
		
		
	}
	public String  getCompanyName()
	{
		return companyName;
		
	}
}