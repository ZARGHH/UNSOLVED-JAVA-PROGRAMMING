import java.util.Scanner;
class  Printed
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner (System.in);
System.out.println("ENTER THE PRINTED PRICE");
double pr=sc.nextDouble();
double discount= 10.0/100*pr;
 double amount=pr-discount;
System.out.println("AMOUNT AFTER DISCOUNT IS"+amount);
double salestx=6.0/100*amount;
double a2=amount+salestx;
System.out.println("Amount after including sales tax"+a2);

	}
}
