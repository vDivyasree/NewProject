package com.java;

public class uppercaselatters {
	public static void main(String[] args) {
		String src = "DiyAsRi";
		
		for(int i=0;i<src.length();i++) {
			char ch1 =src.charAt(i);
			
			if(Character.isUpperCase(ch1)) 
				System.out.println(ch1);
			}
			
		}
	}


