import java.util.Scanner;
class SumUsingLoop
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
        int sum=0;
		int temp=num;

		while(num>0){
			int rem=num%10;
			num/=10;
			if(rem%2==0 || rem%2!=0){
				sum+=rem;

			}
		}
    		System.out.println("sum of number is: "+sum);
    		System.out.println("number is: "+temp);
			}
}

		
		