package com.palinedrome;

public class ForLoopPalinedrome {

	public static void main(String[] args) {
		//palindrome for loop.
		
			
		
		 String rev1 = "Mom";         //M o m
		                              //0 1 2-1
		  
		  System.out.println("Enter a string: " +rev1);
		  
		  String count="";
		  
	     for ( int i =rev1.length()-1; i>=0;i--) 
	   	 
	        count = count + rev1.charAt(i);  
	        
	     if (rev1.equalsIgnoreCase(count)) 
	   	  
	        System.out.println(rev1+" is a palindrome.");  
	     
	     else 
	        System.out.println(rev1+" isn't a palindrome."); 
	     
		
		}

	}


