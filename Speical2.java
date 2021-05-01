import java.util.Scanner;
class Speical2 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");
System.out.println("ENTER THE NUMBER");
int a=sc.nextInt();
System.out.println("ENTER THE FIRST NUMBER");
		int b=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int c=sc.nextInt();

		int sum=b+c;
		System.out.println("the sum  of two number is"+sum);
		int prod=b*c;
		System.out.println("the product of two number is"+prod);
		int s=sum+prod;
		System.out.println("number is"+s);

		if(a==s)
		{
			System.out.println("SPEICAL 2 DIGIT NUMBER");
		}
		else
		{
			System.out.println("NOT A SPECIAL NUMBER");
		}
		System.out.println("MAIN METHOD ENDS");

	}
}
