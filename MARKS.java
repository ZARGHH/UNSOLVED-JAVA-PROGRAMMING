import java.util.Scanner;
class MARKS 
{
	public static void main(String[] args) 
	{
System.out.println("MAIN METHOD STARTED");
Scanner sc=new Scanner(System.in);
System.out.println("ENTER science MARKS");
int s=sc.nextInt();
System.out.println("ENTER MATHS MARKS");
int m=sc.nextInt();
System.out.println("ENTER ENGLISH MARKS");
int e=sc.nextInt();

if(e>=80 && m>=80 && s>=80)
		{
	System.out.println("pure science");
		}
		if(e>=80 && s>=80 ||m>=60)
		{
			System.out.println("BIO SCIENCE");
		}
		if(e>=60 && m>=60 && s>=60)
			{
			System.out.println("COMMERCE");
			}
			else
		{
				System.out.println("NO STREAM ALLOTED");

		}
		System.out.println("MAIN METHOD ENDED");


	}
}
