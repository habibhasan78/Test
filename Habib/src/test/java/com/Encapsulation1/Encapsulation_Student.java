package com.Encapsulation1;

public class Encapsulation_Student {
  private String name="ggg";
  private void add() {
	   System.out.println(name);
   }
	  
  public static void main(String[] args) {
	  Encapsulation_Student obj =new Encapsulation_Student();
	  obj.add();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}}


  

