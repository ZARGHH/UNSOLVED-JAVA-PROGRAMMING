 import java.util.Scanner;
 class DASA 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
String name=sc.next();
System.out.println("enter the basic salary");
double ba=sc.nextDouble();
double da=0.0;
double sa=0.0;

if(ba<=10000)
		{
	da=ba*15.0/100.0;
	sa=ba*5.0/100.0;
	}
	else if(ba<=20000)
		{
		da=ba*20.0/100.0;
		sa=ba*8.0/100.0;
		}
		else if(ba<=30000)
		{
			da=ba*25.0/100.0;
			sa=ba*10.0/100.0;
}
else
	{
da=ba*30.0/100;
sa=ba*12.0/100.0;
}
double gs=ba+sa+da;
System.out.println("the gross salary is"+gs);

   }
	}