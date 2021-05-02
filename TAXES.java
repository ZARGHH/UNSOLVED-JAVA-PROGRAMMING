import java.util.Scanner;
class TAXES 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("main method started");
System.out.println("ENTER YOUR ANNUAL SALARY");
int s=sc.nextInt();
double tax=0.0;
if(s<=250000)
		{
	System.out.println("no tax");
		}
		else if(s>250001 && s<=500000)
		{
			tax=0.1*s;
		}
else if(s>500001 && s<=1000000)
		{
tax=10000 +0.2*(s-500000);
}
else
		{
	tax=25000+0.3*(s-1000000);
		}
		System.out.println("TAX PAID BY HIM IS"+tax);
		System.out.println("main method ended");

	}
}
