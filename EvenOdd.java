import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String str=String.valueOf(num);
		int len=str.length();
		int rem=0;
		int rev=0;
		int rev1=0;

		if(len%2==0)
		{
					while(num>0)
			{
				rem=num%10;
				if(rem%2==0)
				{
					rev=rev*10+rem;
				}
				else{
					
					rem+=1;
					rev=rev*10+rem;

				}
				num/=10;

			}
			
					}
		else{
		
			while(num>0)
			{
				rem=num%10;
				if(rem%2!=0)
				{
					rev=rev*10+rem;
				}
				else{
					rem+=1;
					rev=rev*10+rem;
				}
				num/=10;
			}
					}
		while(rev>0)
		{
			rem=rev%10;
			rev1=rev1*10+rem;
			rev/=10;
		}
		System.out.println(rev1);

	}
}