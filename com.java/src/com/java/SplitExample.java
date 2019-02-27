package com.java;
//
//public class ReversNo {
//
//	public static void main(String[] args) {
//		int n=114445565;
//		String s=Integer.toString(n);
//		System.out.println(s);
//	}

public class SplitExample{
public static void main(String args[]){
String s1="java string split method by javatpoint";
String[] words=s1.split("\\s");//splits the string based on string
//using java foreach loop to print elements of string array
for(String w:words){
System.out.println(w);
StringBuffer sb = new StringBuffer(w);
sb.reverse();
System.out.println(sb);
}
}}