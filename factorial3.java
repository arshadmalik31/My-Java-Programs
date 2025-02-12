class factorial3
{
	public static void main(String[] args) {
		int num=23174;
		int sum=0;
		int dup=num;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2!=0)
			{
			int fact=1;
			for(int i=rem;i>=1;i--)
				fact *=i;
			sum+=fact;
		}
			num/=10;
       }
	System.out.println(dup);
		System.out.println("Sum of the factorial of digit is "+sum);
}
}