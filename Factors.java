package com.edu;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter number :-");
		num=scanner.nextInt();
		
		System.out.println("Factors of"+num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
			
			
			
		}
		
		

	}

}
