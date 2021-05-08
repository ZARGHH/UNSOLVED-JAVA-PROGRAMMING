package simple.java;
import java.util.Scanner;
public class SALES {

	public static void main(String[] args) 
	{
		double dp,amt;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the showroom price of car");
int sp=sc.nextInt();
System.out.println("enter the term");
int t=sc.nextInt();
switch(t)
{
case 1:
	dp=10.0/100.0*sp;
	amt=sp-dp;
	System.out.println(dp);
	System.out.println(amt);
	break;
case 2:
	dp=20.0/100.0*sp;
	amt=sp-dp;
	System.out.println(dp);
	System.out.println(amt);
	break;
case 3:
	dp=30.0/100.0*sp;
	amt=sp-dp;
	System.out.println(dp);
	System.out.println(amt);
	break;
case 4:
	dp=50.0/100.0*sp;
	amt=sp-dp;
	System.out.println(dp);
	System.out.println(amt);
	break;
default:
	dp=60.0/100.0*sp;
	amt=sp-dp;
	System.out.println(dp);
	System.out.println(amt);
}



}
	}


