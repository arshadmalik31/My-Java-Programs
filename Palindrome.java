class Palindrome
{
	public static void main(String[] args) {
		int num=121;
		int dup=num;
		int rev=0;
		while(num>0)
		{
			int rem =num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(dup==rev)
		{
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}

	}
}