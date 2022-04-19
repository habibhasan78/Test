package com.primeNumber;

import java.util.Scanner;

public class ForLoop_Scanner_PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int count=0;
		int num=input.nextInt();
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			
			System.out.println("prime number");
		}else {
			
			System.out.println("not prime number");
		}

	}

}
