package com.ifelseprogramming;
import java. util.Scanner;
public class Positve {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
if(n>0)
{
	System.out.println("Number is positve");
	
}
else if(n<0)
{
	System.out.println("Number is not postive");
	
}
else
{
	System.out.println("Number is negative");
}

	}

}
