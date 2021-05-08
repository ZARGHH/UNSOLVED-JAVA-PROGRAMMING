package simple.java;
import java.util.Scanner;
public class Prmoter {

	public static void main(String[] args) 
	{
System.out.println("Start of java program");
Scanner sc=new Scanner(System.in);
double total=0.0;
System.out.println("ENTER THE PRICE");
double price=sc.nextDouble();
System.out.println("Enter your choice");
int n=sc.nextInt();
switch(n)
{
case 0:
	double d1=price*10.0/100.0;
	double de1=price*8.0/100.0;
	System.out.println(d1);
	System.out.println(de1);
	break;
case 1:
	double d2=price*2.0/100.0;
	double de2=price*1.0/100.0;
	System.out.println(d2);
	System.out.println(de2);
	break;
case 2:
	double d3=price*5.0/100.0;
	double de3=price*5.0/100.0;
	System.out.println(d3);
	System.out.println(de3);
	break;
case 3:
	double d4=price=7.5/100.0;
	double de4=price*10.0/100.0;
	System.out.println(d4);
	System.out.println(de4);
	default:
		System.out.println("WRONG CHOICE");
		
}
}


	}


