import java.util.Scanner;
class ProductUsingLoop
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
        int prod=1;
		int temp=num;


		while(num>0){
			int rem=num%10;
			num/=10;
			if(rem%2==0 || rem%2!=0){
				prod*=rem;

			}
		}
    		System.out.println("prod of number is: "+prod);
    		System.out.println("number is: "+temp);
			}
}

		
		