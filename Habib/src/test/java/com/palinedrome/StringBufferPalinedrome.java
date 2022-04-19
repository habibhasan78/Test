package com.palinedrome;

public class StringBufferPalinedrome {

	public static void main(String[] args) {
		
	       

		String xyz ="Mok";//moM
		StringBuffer abc = new StringBuffer (xyz);
		abc.reverse();
		String jkl=abc.toString();
		if(xyz.equalsIgnoreCase(jkl))
			System.out.println("this is palindrome "+xyz);
		else {
			System.out.println("this is not palindrome ");
		}
	}
	
	


	}


