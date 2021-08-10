package com.ifelseprogramming;
import  java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a");
			double a=sc.nextDouble();
			System.out.println("Enter b");
			double b=sc.nextDouble();
			System.out.println("Enter c");
			double c=sc.nextDouble();
			 
	double res=b*b-4.0*a*c;
	if(res>0.0)
	{
		double z1=(-b+ Math.pow(res,0.5))/(2.0*a);
		double z2=(-b - Math.pow(res,0.5))/(2.0*a);
		System.out.println("Roota are"+z1+"and"+z2);
	}
	else if(res==0.0)
	{
		double z1=-b/2*a;
		
			System.out.println("ROOTS ARE"+z1);
		}
		else
		{
			System.out.println("roots are not real");
		}
		
	}
	
	}
	

	
