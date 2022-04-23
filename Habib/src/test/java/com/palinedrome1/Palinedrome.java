package com.palinedrome1;

public class Palinedrome {                       //Mom
	                                             //moM
	static boolean Palindronme(String str) {    
		int i=0,  j = str.length()-1;           // m o m         m o m
                                                // 0 1  2        2  1 0
		while(i<j) {//mom                          2  1 0
			//     i=0 < j=123-1                 //m   //mom
			        //0<012
			        //(0)!=(012)
			if(str.charAt(i) !=str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String abc="MOM";
		abc=abc.toLowerCase();
		//abc.equalsIgnoreCase(abc);
	
	if(Palindronme(abc)) 
		System.out.println("this is palindrome "+abc);
		
	else {
			System.out.println("this is not palindrome");
		
	}
		
		
	}}
//--------------------------------------------------------------------
//public static void main(String[] args) {
//	int rem,sum=0,temp;
//	int num=151;
//	temp=num;
//	while(num>0) {//151>0
//		
//	    rem=num%10;//       151%10=1,   15%10=5;      1%10=1
//		sum=(sum*10)+rem;// (0*10)+1=1, (1*10)+5=15,  (15*10)+1=151
//		num=num/10;//       151/10=15,  15/10=1,      1/10=0
//	}
//	if(temp==sum) {
//		System.out.println("This is palindrome");
//	}else {
//		System.out.println("This is not palindrome");
//}
//}
//
//}



