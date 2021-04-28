import java.util.Scanner;
class Investment 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter the sum");
double p=sc.nextDouble();
double r=5;
int t=3;
double a,a1,a2;
double i;
//INTREST FOR FIRST YEAR
i=p*5.0*1/100.0;
a=p+i;
System.out.println("THE INTREST FOR FIRST YEAR IS"+i);
//Intrest for second year
p=a;
i=p*5.0*1/100.0;
a1=p+i;
System.out.println("INTREST FOR SECOND YEAR IS"+i);
p=a1;
i=p*5.0*1/100.0;
a2=p+i;
System.out.println("AMOUNT is "+a2);


	}
}
