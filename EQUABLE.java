import java.util.Scanner;
class EQUABLE 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MAIN MEETHOD STARTED");
		System.out.println("enter the three side of the traingle");
	double  m=sc.nextDouble();
double n=sc.nextDouble();
double p=sc.nextDouble();
double k=(m+n+p)/2.0;
  double area=Math.sqrt(k*(k-m)*(k-n)*(k-p));
 System.out.println("area of the traingle is"+area);
double per=m+n+p;
System.out.println("PERIMETER OF THE TRAINGLE IS"+per);
if(area==per)
		{
	System.out.println("EQUABLE TRIANGLE");
	}
	else
		{
		System.out.println("NOT EQUABLE");
		}
			System.out.println("MAIN METHOD ENDED");	
	}
}
