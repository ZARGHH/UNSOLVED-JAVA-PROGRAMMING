import java.util.Scanner;
class EMPLOYEE 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");

System.out.println("ENTER THE NAME OF EMPLOYEE");
System.out.println(" ENTER THE NAME OF THE EMPLOYEE AND SALARY");
	String name=sc.next();
	System.out.println("ENTER THE AGE OF THE EMPLOYEE");
	int age=sc.nextInt();
System.out.println("ENTER THE BASIC SALARY OF EMPLOYEE");
	int ba=sc.nextInt();
double epf,hra,pf,np=0,gp=0;
hra=0.4*ba;
pf=0.12*ba;
epf=0.02*ba;
gp=ba+hra;
np=gp-(pf-epf);
//Condition stated
if(gp<=250000)
		{
	System.out.println("male");
	System.out.println("NOT A TAX PAYER");
		}
		else if (gp<=300000)
		{
			System.out.println("female");
			System.out.println("not a tax payer");
		}
		System.out.println("MAIN METHD ENDED");

	}
}
