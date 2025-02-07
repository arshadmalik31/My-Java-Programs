import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of cylinder");
		float radius =sc.nextFloat();
		System.out.println("Enter height of cylinder");
		float height =sc.nextFloat();
		float area = 3.14f * radius * radius;
		System.out.println(area);
		float voloume = area*height;
		System.out.println(voloume);

	}
}
