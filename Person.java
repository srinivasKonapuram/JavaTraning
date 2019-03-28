package com.imagniea.javaTraning;
public class Person {
	 public static String male="m";
public static String female="f";
	private String name;
	private int age;
	private String gender;

	public Person(String name, String gender, int age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
public String getName(){
	return  name;
}
	public boolean isageEnoughToDrive() {
		return checkValidAge(age,AdminstartionDepartmet.minimum_age__to_Drive);

	}

	public boolean isageEnoughTovote() {
		return checkValidAge(age,AdminstartionDepartmet.minimum_age__to_vote);
	}

	public boolean isageEnoughToGetMarried() {
		return (ismale()&&checkValidAge(age,AdminstartionDepartmet.minimum_age__to_GetMarried_forBoy))||(isfemale()&&checkValidAge(age,AdminstartionDepartmet.minimum_age__to_GetMarried_forGril));

	}

	public boolean ismale() {
		return istwostringsequall(gender, "m");
	}

	public boolean isfemale() {
		return istwostringsequall(gender, "f");
	}

	public boolean istwostringsequall(String first, String second) {
		return first.equals(second);
	}
	public boolean checkValidAge(int age, int minimumage) {
		return age >= minimumage;
	}
	public 	 static void print(Person person)
	{		
		System.out.println(person.getName()+ " age is  valid to drive "+ person.isageEnoughToDrive());
		System.out.println(person.getName()+ " age is  valid to vote "+ person.isageEnoughTovote());
		System.out.println(person.getName()+ " age is valid to marry  "+ person.isageEnoughToGetMarried());
	}
}
