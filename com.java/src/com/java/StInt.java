package com.java;

public class StInt {

	public static void main(String[] args) {
		String s1 ="divya swamy 1234 swamy";
		int cont=4 , mul=1 ,num;
		
String n=s1.replaceAll("[^0-9]","" );
System.out.println(n);

int n1=Integer.parseInt(n);
while(n1>=0) {
	num=n1%10;
	mul=mul*num;
	n1=n1/10;
	System.out.println(mul);
	
	
}
	
}
}
	
	
	


