package jspider;
import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,n, m,min=0 ,max=0;
n=sc.nextInt();
min=n;
max=n;
System.out.println("enter a number");
for(a=1;a<10;a++)
{
	m=sc.nextInt();
	if(m<min)
		min=m;
	if(m>max)
		max=m;
	
}
System.out.println("maximum number is"+max);
System.out.println("minimum number is"+min);

	}

}
