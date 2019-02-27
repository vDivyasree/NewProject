package com.java;

public class Methdoverload {
	void m1(int a, double b) {
		System.out.println(a);
		System.out.println(b);
	}
	void m1(double a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Methdoverload m=new Methdoverload();
		m.m1(10, 124.12);

}
}