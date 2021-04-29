import java.util.Scanner;
class ABCTriangle 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");
System.out.println(" ENTER THE THREE SIDE OF A TRAINGLE");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int k=180;
int k2=a+b+c;
if(k==k2)
		{
	System.out.println("TRIANGLE IS POSSIBLE");
		}
		if(k==180 && a>0 && b>0 && c>0)
		{
			if(a<90 && b<90 && c<90)
			{
				System.out.println("ACUTE ANGLE TRINAGLE");
				}
		}
		else if(a==90||b==90||c==90)
			{

			System.out.println("RIGHT ANGLED TRIANGLE");
			}

		if 
		(a>90||b>90||c>90)
		{
			System.out.println("obtuse angle triangle");
		}
		
	
		System.out.println("MAIN METHOD ENDED");
	}
}
