import java.util.Scanner;
class HiEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		String str=((num==0)?("__"):((num%2==0 && num%5==0)?("hitwofive"):((num%5==0)?
						  ("hifive"):((num%2==0)?("hitwo"):("__")))));

	System.out.println(str);
	}

}
