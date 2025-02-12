import java.util.Scanner;
class PrimeFactors{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();

		for(int i=1; i<=num; i++)
		
			if(num%i==0){
				if(i%2!=0 && i!=1)
			{
				System.out.println(i+" ");

			}
			if(i==2){
				System.out.print(i+" ");
			}
			}
		}

		
	}
