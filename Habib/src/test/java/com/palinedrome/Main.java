package com.palinedrome;

public class Main {

static boolean palindrom(String str) {
	
	int i =0, j =str.length()-1;
	while(i<j) {
		if(str.charAt(i) !=str.charAt(j))
		return false;
		i++;
		j--;
		
	}
	return true;
	
	
}
public static void main(String[] args) {
	String abc="Mom";
	//abc=abc.toLowerCase();
	
	if(abc.equalsIgnoreCase(abc))
	System.out.println("palindrome");
	else {
		System.out.println("not palindrome");
	
	}
}
}
