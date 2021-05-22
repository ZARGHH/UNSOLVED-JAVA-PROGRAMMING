package jspider;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args)
	{
		boolean b=false;
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
switch(ch)
		{
		case 'a':
		case 'e':
		case  'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':b=true;
		}
if(b==true)
{
	System.out.println("Character is vowel");
}
else {
	System.out.println("Character is a consonant");
}	
	
		
		}
		
		
	}


