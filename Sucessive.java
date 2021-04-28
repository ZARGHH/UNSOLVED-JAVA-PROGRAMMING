import java.util.Scanner;
class Sucessive 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the price of an article");
	double pr=sc.nextDouble();
// DETAIL OF FIRST SHOP KEEPER
double d1=30.0/100.0*pr;
	double a1=pr-d1;
System.out.println(" amount after the discount of 1st shop keeper"+a1);
//DETAIL OF 2ND SHOP KEEPER
double d2=(20+10-2);//formula for sucessive discount
double a2=d2/100*pr;
System.out.println("AMOUNT AFTER THE DICOUNT OF 2ND SHOPKEEPER"+a2);
if(a1>a2)
		{
	System.out.println("1ST Dicount is better");
		}
		else
			System.out.println("Discount 2 is better");

	}
}
