package com.java;

public class Constructor {

	Constructor(){
		System.out.println("string");
		
	}
	Constructor(int a, int b)
	{
		System.out.println(a+b);
	}
	Constructor(int c){
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Constructor c= new Constructor( 10,20);
		Constructor c1=new Constructor(43);
		

	}

}
