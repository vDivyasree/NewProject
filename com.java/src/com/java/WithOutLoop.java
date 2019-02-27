package com.java;

public class WithOutLoop {

	public static void main(String[] args) {
int n=1;
int c=fun(n);
}

	private static int fun(int n) {

if(n==101)
		return 0;
else {
	System.out.println(n+"");
	return fun(n+1);
}
		
		
		
	}

}
