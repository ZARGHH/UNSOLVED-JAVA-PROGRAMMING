package simple.java;
import java.util.Scanner;
public class Complap {

	public static void main(String[] args) {
System.out.println("start of java program");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the customer");
String name=sc.next();
System.out.println("Enter the address of the customer");
String add=sc.next();
System.out.println("Enter the amount of purchase");

double price=sc.nextDouble();
System.out.println("TYPE OF  PURCHASE");
String type=sc.next();
System.out.println("Enter your choice");
int n=sc.nextInt();
 double dl=0.0;
 double dc=0.0;
 double nal=0.0;
 double nad=0.0;
 switch(n)
 {
 case 1:
	 dl=0.0/100.0*price;
	 dc=5.0/100.0*price;
	 nal=price-dl;
	 nad=price-dc;
	 System.out.println(nal);
	 System.out.println(nad);
	 break;
	 
 case 2:
	 dl=5.0/100.0*price;
	 dc=7.5/100.0*price;
	 nal=price-dl;
	 nad=price-dc;
	 System.out.println(nal);
	 System.out.println(nad);
	 break;
 case 3:
	 dl=7.5/100.0*price;
	 dc=10.0/100.0*price;
	 nal=price-dl;
	 nad=price-dc;
	 System.out.println(nal);
	 System.out.println(nad);
	 break;
 default:
	 dl=10.0/100.0*price;
	 dc=15.0/100.0*price;
	 nal=price-dl;
	 nad=price-dc;
	 System.out.println(nal);
	 System.out.println(nad);
	 
 }
 System.out.println("Discount IN LAPTOP is"+dl);
 System.out.println("Discount in Computer is"+dc);
 System.out.println("Net AMOUNT OF LAPTOP IS"+nal);
 System.out.println("NET amount of COMPUTER IS"+nad);
 
 
	}

}
