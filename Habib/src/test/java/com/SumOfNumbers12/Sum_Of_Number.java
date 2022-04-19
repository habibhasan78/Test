package com.SumOfNumbers12;

public class Sum_Of_Number {

	public static void main(String[] args) {
		int [] a=  {10,2,3,4,5,6,8,9,1};
        int sum=12;//0 1 2 3 4 5 6 7 8
                                               //
        for(int i =0; i<a.length; i++) {
        for( int j=i+1; j<a.length; j++) {
        	
        if(a[i]+a[j]==12) {
        	
        	System.out.println(a[i]+","+a[j]);
              
                 }	
        	
          
            }
        	
        	
        }
	}

}
