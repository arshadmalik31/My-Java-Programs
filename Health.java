import java.util.Scanner;
class Health 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in pounds: ");
		float pounds =sc.nextFloat();
		System.out.println("Enter the height in inches: ");
		float inches = sc.nextFloat();

		float kg=pounds*0.45359237f;
		float meter = inches*0.0254f;

         float bmi = kg/(meter * meter);
		 System.out.println("BMI is "+bmi);

	}
}
