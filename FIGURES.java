package simple.java;
import java.util.Scanner;
public class FIGURES {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE THE VALUES OF THE FIGURE");
double r=sc.nextDouble();
double l=sc.nextDouble();
double b=sc.nextDouble();
double s=sc.nextDouble();
System.out.println("ENTER YOUR CHOICE");
int n=sc.nextInt();
switch(n)
{
case 1:
	double area1=22/7*r*r;
	System.out.println("area of circle is"+area1);
	break;
case 2:
	double area2=s*s;
	System.out.println("area of square"+area2);
	break;
case 3:
	double area3=l*b;
	System.out.println("area of the rectangle is"+area3);
	break;
	default:
		System.out.println("WRONG CHOICE");
}


	}

}
