
import java.util.Scanner;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch=sc.next().charAt(0);
		String str=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+" is a vowel"):(ch+" is a constant");
		System.out.println(str);
	}
}
