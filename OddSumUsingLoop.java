import java.util.Scanner;
class OddSumUsingLoop
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
			if(rem%2!=0){
				sum+=rem;

			}
		}
    		System.out.println("number is: "+temp);
    		System.out.println("sum of odd number is: "+sum);
			}
}

		
		