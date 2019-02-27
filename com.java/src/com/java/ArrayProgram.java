package com.java;


import java.util.Arrays;
import java.util.Collections;



public class ArrayProgram {

	void m1(){
// this code is for ascending order
int[]arr= {2,34,54,1,78,5,9};
Arrays.sort(arr);
//System.out.println("acsending order");
//System.out.printf("modified array[]:%s" , Arrays.toString(arr));}
	
	}
	
	
	void m2() {
		Integer[]arr1= {4,65,54,1,9,46,0};
		Arrays.sort(arr1,Collections.reverseOrder());
		//System.out.println("dcsending order");
		//System.out.printf("modified array[]:%s" , Arrays.toString(arr1));}
	System.out.println( Arrays.toString(arr1));}
	void m3() {
		String []arr2 = {"divya", "swamy","my name is"};
		Arrays.sort(arr2);
		System.out.println("acsending order");
		System.out.printf("modified array[]:\n%s" , Arrays.toString(arr2));}
	
	
	void m4() {
		String []arr3 = {"divya", "swamy","my name is"};
		Arrays.sort(arr3,Collections.reverseOrder());
		//System.out.println("dcsending order");
		//System.out.printf("modified array[]:%s" , Arrays.toString(arr3));
		System.out.printf( Arrays.toString(arr3));
	}

	
	
		void m5() {
			Integer []arr4 = {26,54,67,98,89};
			System.out.println("orginal array:"+Arrays.toString(arr4));
			Collections.rotate(Arrays.asList(arr4),4 );
			System.out.println("modified array:"+Arrays.toString(arr4));
		}
	
		
	
	public static void main(String[] args) {	
		ArrayProgram ap= new ArrayProgram();
		//ap.m1();
		ap.m2();
		//ap.m3();
		ap.m4();
		//ap.m5();

	}

}
