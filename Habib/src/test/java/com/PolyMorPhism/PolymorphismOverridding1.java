package com.PolyMorPhism;

public class PolymorphismOverridding1 extends PolymorphismOverridding {

	  //String qulification;
	
	  
	 void displayInformation() {
    	 
	    	System.out.println("Name : "+"jahid"); 
	    	 
	    	 System.out.println("Age : "+ 30);
	    	 
	     }
	  public static void main(String[] args) {
		  PolymorphismOverridding t= new PolymorphismOverridding1();
	    	 t.displayInformation("Habib");
	    	 PolymorphismOverridding t1= new PolymorphismOverridding1();
	    	 t.displayInformation(40);
		 // PolymorphismOverridding obj = new PolymorphismOverridding();
			//obj.displayInformation();	 

}
	
	}
