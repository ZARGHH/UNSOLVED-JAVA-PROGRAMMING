package simple.java;
import java.util.Scanner;
public class Prmoter {

	public static void main(String[] args) 
	{
System.out.println("Start of java program");
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE PRICE");
double price=sc.nextDouble();
System.out.println("Enter your choice");
int n=sc.nextInt();
double dp,ddc,td,pd;
switch(n) {

case 0:
dp=10.0/100.0*price;
ddc=8.0/100.0*price;
td=dp-ddc;
pd=price-td;
break;
case 1:
	dp=2.0/100.0*price;
	ddc=1.0/100.0*price;
	td=dp-ddc;
	pd=price-td;
	System.out.println(td);
	System.out.println(pd);
	break;
case 2:
	dp=5.0/100.0*price;
	ddc=5.0/100.0*price;
	td=dp-ddc;
	pd=price-td;
	System.out.println(td);
	System.out.println(pd);
	break;
case 3:
	dp=7.5/100.0*price;
	ddc=10.0/100.0*price;
	td=dp-ddc;
	pd=price-td;
	System.out.println(td);
	System.out.println(pd);
	break;
	default:
		System.out.println("wrong choice");
	
}
}


	}


