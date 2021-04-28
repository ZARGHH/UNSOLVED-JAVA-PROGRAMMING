import java.util.Scanner;
class Profiloss 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MAIN METHOD STARTED");
System.out.println("ENTER THE COST PRICE");
double cp=sc.nextDouble();
System.out.println("ENTER THE SELLING PRICE");
double sp=sc.nextDouble();
if(sp>cp)
		{
	double p=sp-cp;
double per=p/cp*100.0;
System.out.println("PROFIT PERCENTAGE IS"+per);
		}
		if(sp<cp)
		{
			double l=cp-sp;
			double per2=l/cp*100.0;
			System.out.println("LOSS PERCENTAGE IS"+per2);
			System.out.println("MAIN METHOD ENDED");
		}

	}
}
