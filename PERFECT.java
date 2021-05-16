package jspider;
import java.util.Scanner;
public class PERFECT {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int a,n,s=0;
n=sc.nextInt();
for(a=1;a<n;a++)
{
	if(n%a==0)
		s=s+a;
}
if(s==n)
{
	System.out.println("the number is perfect");
}
else
	System.out.println("number is not perfect");

}
	}


