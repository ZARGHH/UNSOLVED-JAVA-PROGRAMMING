package simple.java;
import java.util.Scanner;
public class VOLUME {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE SIDE OF CUBE");
double s=sc.nextDouble();
System.out.println("enter the radius of sphere");
double r=sc.nextDouble();
System.out.println("ENTER THE LENGTH,BREADTH,HEIGHT OF A CUBOID");
double l=sc.nextDouble();
double b=sc.nextDouble();
double h=sc.nextDouble();
 System.out.println("ENTER YOUR CHOICE");
 int n=sc.nextInt();
switch(n) 
{
case 1:
	double vol1=s*s*s;
	System.out.println("the volume of cube is"+vol1);
	break;
case 2:
	double vol2=4/3*22/7*r*r*r;
	System.out.println(" the volume of sphere is"+vol2);
	break;
case 3:
	double vol3=l*b*h;
	System.out.println("the volume of cuboid is"+vol3);
	break;
	default:
		System.out.println("INCORRECT OPTION");
		
}
 
	}

}
