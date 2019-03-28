package com.imagniea.javaTraning;

public class AdminstartionDepartmet {
 public static int  minimum_age__to_vote=18;
 public static int  minimum_age__to_Drive=18;
 public static int  minimum_age__to_GetMarried_forGril=18;
 public static int minimum_age__to_GetMarried_forBoy=21;
	public static void main(String[] args) {
	Person meena=new Person("meena",Person.female,20);
	Person mounika=new Person("mounika",Person.male,20);
	Person srinu=new Person("srinu",Person.male,20);
	Person arun=new Person("arun",Person.male,22);
	Person teddy=new Person("teddy",Person.male,18);
			srinu.print(srinu);
			System.out.println("------------");
			arun.print(arun);
}
}
