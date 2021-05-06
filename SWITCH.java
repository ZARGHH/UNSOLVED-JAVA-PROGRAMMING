package simple.java;
import java.util.Scanner;

public class SWITCH {
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE TEMPRATURE WHICH IS  TO CONVERTED");
double f=sc.nextDouble();
double c=sc.nextDouble();
System.out.println("ENTER YOUR CHOICE");
int n=sc.nextInt();
switch(n)
{
case 1:
	double conversion=5/9*(f-32);
	System.out.println("the conversion is"+conversion);
	break;
case 2:
	double conversion2=1.8*c+32;
	System.out.println("the conversion is"+conversion2);
	break;
	default:
		System.out.println("WRONG CHOICE");
		
}
	}

}
