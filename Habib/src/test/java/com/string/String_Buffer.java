package com.string;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Habib");
		System.out.println(sb);
		sb.append(" hasan");
		System.out.println(sb);

//----------------------------------------------------
		sb.reverse();
		System.out.println(sb);
		
		sb.delete(3, 5);
		System.out.println(sb);
//---------------------------------------------------------
		sb.setLength(5);
		System.out.println(sb);
	}

}
