import java.util.Scanner;
class Library 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MAIN METHOD STARTED");
		System.out.println("ENTER THE NUMBER OF DAYS");
		int days=sc.nextInt();

		double  fine,fine1,fine2;
		{
			  if (days > 0 && days <= 5)
			{
				  fine=0.40*days;
System.out.println("FINE IS"+fine);
			}

			    else  if (days > 6 && days <= 10)
				{

					fine1=0.65*days;
					System.out.println("FINE IS"+fine1);
				}
 else if (days > 10)	{	
	  fine2=0.80*days;
System.out.println("FINE IS"+fine2);
	System.out.println("FINE IS GREATER");
 }
	}
}
}