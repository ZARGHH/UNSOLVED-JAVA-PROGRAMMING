package simple.java;
import java.util.Scanner;
public class ARITHMATIC {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter the two number");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("enter your choice");
int n=sc.nextInt();
switch(n)
{
case 1:
	int sum=a+b;
	System.out.println("the sum is"+sum);
	break;
case 2:
	int diff=a-b;
	System.out.println("the difference is"+diff);
	break;
case 3:
	int prod=a*b;
	System.out.println("the prod is"+prod);
	break;
case 4:
int div=a/b;
System.out.println("the division is"+div);
break;
default:
	System.out.println("wrong choice");

}
	}

}
