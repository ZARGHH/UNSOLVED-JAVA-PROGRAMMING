package simple.java;
import java.util.Scanner;
public class TRAIN {
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
 System.out.println("enter the velocity 1");
 double va=sc.nextDouble();
 System.out.println("enter the velocity 2");
 double vb=sc.nextDouble();
 System.out.println("ENTER THE LENGTH OF TRAIN 1");
 int la=sc.nextInt();
 System.out.println("ENTER THE LENGTH OF TRAIN 2");
 int lb=sc.nextInt();
 System.out.println("ENTER YOUR CHOICE");
 int l=sc.nextInt();
 switch(l)
 {
 case 1:
	 System.out.println("the length of train a  and b"+la+"and"+lb);
	 double rv1=vb-va;
	 System.out.println("the relative velocity for the same direction is"+rv1);
break;
 case 2:
	 System.out.println("the length of train b and a is"+lb+"and"+la);
	 double rv2=va+vb;
	 System.out.println("the relative velocity for opposite direction is"+rv2);
	 default:
		 System.out.println("WRONG CHOICE");
		 
 }
 
	}

}
