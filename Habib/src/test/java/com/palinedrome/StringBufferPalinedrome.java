package com.palinedrome;

public class StringBufferPalinedrome {

	public static void main(String[] args) {
		String xyz ="mom";//moM
		StringBuffer abc = new StringBuffer (xyz);
		abc.reverse();
		String jkl=abc.toString();
		if(xyz.equalsIgnoreCase(jkl))
		//if(xyz.equalsIgnoreCase(abc.toString()))
			System.out.println("this is palindrome: "+xyz);
		else {
			System.out.println("this is not palindrome ");
	       

	
		}
	}
	
	


	}


