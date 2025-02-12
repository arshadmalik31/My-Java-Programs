import java.util.Scanner;
class EvenOddSum_UsingLoop
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
        int sum1=0;
        int sum2=0;
		int temp=num;


		while(num>0){
			int rem=num%10;
			
			if(rem%2==0){
				sum1+=rem;

			}
			else 
				if(rem%2!=0){
				sum2+=rem;
			}
			num/=10;
		}
    		
    		System.out.println("number is: "+temp);
    		System.out.println("sum of even number is: "+sum1);
    		System.out.println("sum of odd number is: "+sum2);
    		    		

    		

			}
}

		
		