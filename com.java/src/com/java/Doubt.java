package com.java;

public class Doubt
{
	
	long s=23;//  instance variable 
	static long l=45;// static variable
	
		
	Doubt(int x,int y){// constructor
		
	}
	void m1( int e, int f) {
		int a=10;
		int b=20;// instance method 
		System.out.println(a+b);
		System.out.println(e+f);
	}
	static void m2( int g, int h) {
		int c=20;
		int d= 40;//   static method 
		System.out.println(c+d);
		System.out.println(g+h);
	} public static void main(String[] args) {
		String  sr= "divya";//local variable
		System.out.println(sr);//local variable calling
		System.out.println(l);//static variable  calling 
		
		Doubt d = new Doubt(23, 45);
		d.m1(12,22);//instance method calling
	Doubt.m2(22,34);//static method  calling
	System.out.println(d.s);//instance variable calling
	}
	


}
