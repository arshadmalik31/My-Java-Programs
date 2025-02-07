class Product
{
	public static void main(String[] args) 
	{
		int num=1234;
        int prod=1;
		int rem=num%10;
		prod=prod*rem;
		 num=num/10;

		 rem =num%10;
		 prod=prod*rem;
		 num=num/10;

		 rem =num%10;
		 prod=prod*rem;
		 num=num/10;

         rem=num%10;
		 prod=prod*rem;
		 num=num/10;

		System.out.println(prod);
	}
}
