package simple.java;
import java.util.Scanner;
public class Logarithm {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
double a=sc.nextDouble();
		System.out.println("Enter your choice");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			double loga=Math.log(a);
			System.out.println("log value of a is"+loga);
			break;
		case 2:
			double d=Math.abs(a);
			System.out.println("the absolute value of a is"+d);
			break;
		case 3:
			double s=Math.sqrt(a);
			System.out.println("the square root of a is"+s);
			break;
		case 4:
			double d2=Math.random();
			System.out.println("the  random value is"+d2);
			break;
			default:
				System.out.println("WRONG CHOICE");
				
		}
	}

}
