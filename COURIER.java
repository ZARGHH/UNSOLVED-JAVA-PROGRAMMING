import java.util.Scanner;
class COURIER 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE WEIGHT OF THE PARCEL");
		double wt=sc.nextDouble();
		System.out.println("ENTER THE TYPE OF BOOKING");
		char type=sc.next().charAt(0);
		double charge=0;
		if(wt<=100 && type=='O')
			charge=80;
		else if(wt<=100 && type =='E')
			charge=100;
		else if(wt<=500 && type=='O')
			charge=200;
		else if(wt<=500 && type=='E')
charge=350;
		else if(wt>500 && type=='O')
			charge=300;
		else if(wt>500 && type=='E')
charge=400;
			
			System.out.println("PARCEL CHARGES"+charge);
			
	}
}
