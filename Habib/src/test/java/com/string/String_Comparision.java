package com.string;

public class String_Comparision {

	public static void main(String[] args) {
		String passward1="habib123";
		String passward2="habib123";
		String passward3=new String("habib123");
		String passward4=new String("habib123");
		//System.out.println(passward1);
		//System.out.println(passward2);
    	System.out.println(passward1==passward2);
		System.out.println(passward1==passward3);
    	System.out.println(passward3==passward4);

//--------------------------------------------------------
//		String passward1="habib123";
//		String passward2="habib123";
//		String passward3=new String("habib123");
//		String passward4=new String("habib123");
//		
//		System.out.println(passward1.equals(passward2));
//		System.out.println(passward1.equals(passward3));
//		System.out.println(passward3.equals(passward4));

	}

}
