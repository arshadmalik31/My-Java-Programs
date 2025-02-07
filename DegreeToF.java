import java.util.Scanner;
class Dtf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius");
		double celsius=sc.nextDouble();
		double fahrenheit=9.0/5*celsius+32;
		System.out.println(fahrenheit);

	}
}
