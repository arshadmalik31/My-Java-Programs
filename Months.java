import java.util.Scanner;
class Months 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month");
		String month=sc.next().toUpperC
			
		ase();

		String str=(month.equals("OCT"))||(month.equals("Nov"))||
			       (month.equals("DEC"))||(month.equals("JAN"))? month+ "is WINTER":
		           (month.equals("FEB"))||(month.equals("MAR"))||
			       (month.equals("APR"))||(month.equals("MAY"))? month+ "is SUMMER":
				   (month.equals("JUNE"))||(month.equals("JULY"))||
			       (month.equals("AUG"))||(month.equals("SEP"))? month+ "is MONSOON" :"INVALID MONTH";
	   System.out.println(str);
	}

}
