package com.StaticAndNonStatic;
//static and non static
 public class Static_NonStatic {
	 
static int a=100;

public void apple2() {
       int b=200;
System.out.println(b);}

	public static void main(String[] args) {
		System.out.println(a);
		
		Static_NonStatic obj =new Static_NonStatic();
		obj.apple2();
	}
		

	}


