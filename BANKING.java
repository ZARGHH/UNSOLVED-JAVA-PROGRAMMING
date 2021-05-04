import java.util.Scanner;
class BANKING 
{
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("MAIN METHOD STARTED");
System.out.println("ENTER THE SUM");
double p=sc.nextDouble();
System.out.println("ENTER THE AGE");
int age=sc.nextInt();
System.out.println("ENTER THE TERM");
 double term=sc.nextDouble();
	double si=0.0;	

	if (term<=1 && age<60)
		si=(p*7.5*term)/100;
	else if(term<=1 && age>=60)
		si=(p*8.0*term)/100;
else if(term<=2 && age<60)
	si=(p*8.5*term)/100;
else if(term<=2 && age>=60)
	si=(p*9.0*term)/100;

else if(term<=3 && age<60)
	si=(p*9.5*term)/100;
else if(term<=3 && age>=60)
	si=(p*10.0*term)/100;
else if(term>3 && age<60)
	si=(p*10.0*term)/100;
else if(term>3 && age>=60)
	si=(p*11.0*term)/100;
double amt=p+si;
System.out.println("amount deposited"+p);
System.out.println("term is"+term);
System.out.println("age is"+age);
System.out.println("Intrest earned is"+si);
System.out.println("amount paid"+amt);







	}
}
