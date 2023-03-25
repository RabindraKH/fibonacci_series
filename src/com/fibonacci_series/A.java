package com.fibonacci_series;
import java.util.Scanner;
public class A {
	public static void main(String args[]) {
		//scanner class to take the user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number within you want to show the Fibonacci series:");
		int num=scan.nextInt();
		
		//below code is for Fibonacci series
		int a=0,b=1,c=0;
		System.out.print(a+",");
		System.out.print(b+",");
		while(c<=num) {
			c=a+b;
			a=b;
			b=c;
			if(c<=num) {
				System.out.print(c+",");
			}
			
		}
	}

}
