import java.util.Scanner;
class Student_Timetable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println("Enter the option");
		int opt=sc.nextInt();

		switch(opt)
		{
			case 1:{
				System.out.println("Practice Mathematics");
				break;
			}
			case 2:{
				System.out.println("Explore Science");
				break;
			}
			case 3:{
				System.out.println("Study Social Science");
				break;
			}
			case 4:{
				System.out.println("Practice to Speak in English");
				break;
			}
			case 5:{
				System.out.println("Learn Marathi Grammar");
				break;
			}
			case 6:{
				System.out.println("Do Your Art & Craft Work");
				break;
			}
			case 7:{
				System.out.println("Relax & Chill");
				break;
			}
			default:{
				System.out.println("INVALID OPTION");
				break;
			}

		}
	}
}
