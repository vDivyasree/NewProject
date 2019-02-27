package com.java;

public class SwpingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love my country";
		String[]sa =s.split("\\s");
		String  sr="";
		//for(int i =sa.length-1;i>=0;i--) {
		for(String sf:sa)	{
	//sr =(sa[i]+"");
		
		sr=sf+" "+sr;
		
	}
		System.out.println(sr);
}
}