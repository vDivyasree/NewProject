package com.java;

public class RecursiveMethod {
	  void recursive(int a)
	{ System.out.println("number is : "+a);
	if (a==100)
	{return;
	}
	recursive(++a);
	}
	public static void main(String[] args)
	{
		//RecursiveMethod.recursive(1); this for static method
		RecursiveMethod r=new RecursiveMethod();
		r.recursive(1);
		
}
}