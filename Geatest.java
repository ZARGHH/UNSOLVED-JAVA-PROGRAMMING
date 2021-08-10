package com.ifelseprogramming; 
import java.util.Scanner;

public class Geatest {

	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		 int a =sc.nextInt();
			System.out.println("Enter the second number");
			int b=sc.nextInt();
			System.out.println("Enter the third number");
			int c=sc.nextInt();
			 if(a>b )
				 if(a>c)
			 {
				 System.out.println("A is greatest");
			 }
			 if(b>a)
				 if(b>c)
			 {
				 System.out.println("B is greatest");
				 
			 }
			 if(c>a)
				 if(c>b)
			 {
				 System.out.println("C is greatest");
			 }
				 


		 
		
}
}
