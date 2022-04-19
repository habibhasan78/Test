package com.inharitance_interface;

public class Class3 implements Class2,Class1 {

	public static void main(String[] args) {
		 
		Class3 obj =new Class3();
		obj.animal();
	}

	public void animal() {
		System.out.println("lion");
	}

}
