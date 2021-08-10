package com.ifelseprogramming;
import java .util.Scanner;

public class Absolute {

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Floating point number");
double a=sc.nextDouble();
if(a>0)
{
	if(a<1)
	{
		System.out.println("Postive small number");
	}
	else if(a>1000000)
	{
		System.out.println("Positve large Number");
	}

else
{
	System.out.println("Positve Number");
}
}
else if(a<0)
{
	if(Math.abs(a)<1)
	{
		System.out.println("Negative small number");
	}
	else	if(Math.abs(a)>1000000)
	{
		System.out.println("Negative Large Number");
	}
	else
	{
		System.out.println("Negative Number");
	}
}
else
{
	System.out.println("the number is zero");
}
	}

}
