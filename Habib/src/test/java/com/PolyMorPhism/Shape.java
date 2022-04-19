package com.PolyMorPhism;

public class Shape {
	
		public void area(String Circle) {
			System.out.println("Circle");
			
		}		
		
		public void area(String Circle,String Triangle) {
			System.out.println("Circle and Triangle");
			
		}		
		public void area(String Circle,String Triangle,String Rectangle) {
			System.out.println("Circle and Triangle and Rectangle");
			
		}	
		
	public static void main(String[] args) {
		Shape obj =new Shape();
		obj.area("Circle");
		obj.area("Circle" , "Triangle");
		obj.area("Circle", "Triangle","Rectangle");
	} 
	
	

}
