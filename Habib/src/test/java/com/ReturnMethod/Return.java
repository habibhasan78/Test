package com.ReturnMethod;

public class Return {
	
	

	
	String add() {
		String a1="ha";
		return a1;
	
}
public static void main(String[] args) {
	

	
	 Return obj = new  Return ();
	 obj.add();
	 String abc=obj.add();
	 
	//System.out.println(abc);
	System.out.println(obj.add());
}	


	}
