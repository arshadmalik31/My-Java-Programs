import java.util.Scanner;
class If2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your bill ammount");
		 float billAmmount=sc.nextInt();
	
	if(billAmmount>=3000)
		{
		float percent=0;
		percent=(10f/100f*billAmmount);
		System.out.println(percent);

		billAmmount=billAmmount-percent;
		System.out.println("Pay the Ammount with discount : "+billAmmount);

		
	}

		 System.out.println("Pay the billAmmount");
			
		
	}
}
