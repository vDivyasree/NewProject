package com.java;

public class Test {
//	int a;
//	float b;
//	static int c;
//	static float d;
//	public static void main(String[] args)
//	{ System.out.println(Test.c);
//	System.out.println(Test.d);
//	Test t=new Test();
//	System.out.println(t.a);
//	System.out.println(t.b);
	
	
	
	
	//instance variable
//	int a=10;
//	int b=20;
//	static void m1()
//	{ Test t = new Test();
//	System.out.println(t.a);
//	System.out.println(t.b);
//	}
//	static void m2()
//	{ Test t = new Test();
//	System.out.println(t.a);
//	System.out.println(t.b);
//	}
//	public static void main(String[] args)
//	{ Test.m1(); //static method calling
//	Test.m2(); //static method calling
	
	// the object should be expired after the method 
	int a=10;
	int b=20; // instance variables
	static int c=30; static int d=40; //static variables
	void m1() //instance method
	{ System.out.println(a);
	System.out.println(b);
	System.out.println(Test.c);
	System.out.println(Test.d);
	}
	static void m2() //static method
	{ Test t = new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	System.out.println(Test.c);
	System.out.println(Test.d);
	}
	public static void main(String[] args)
	{ Test t = new Test();
	t.m1(); //instance method calling
	Test.m2(); //static method calling
	
}

}