package com.Encapsulation1;

public class Encapsulation {
	
//	private String name;
//	private int age;
//	
//	void display() {
//		System.out.println("Nane : "+name);
//		
//		System.out.println("Age : "+age);
//		
//	}
//	
//	public static void main(String[] args) {
//		Encapsulation obj=new Encapsulation ();
//		obj.name="Anis";
//		obj.age=20;
//		obj.display();
//	}}
//---------------------------------------------------------------
	private String name;
	private int age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void setName(String name) {
		this.name=name;
		
     }
	public String getName() {
		return name;
		
    }
//	//----------------------------------------------------
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation ();
		obj.setName("habib");
		System.out.println(obj.getName());	}}
////-------------------------------------------------------	
//	public static void main(String[] args) {
//		Encapsulation obj=new Encapsulation ();
//		obj.setAge(30);
//		System.out.println(obj.getAge());
//	}
//}
