class Smallest 
{
	public static void main(String[] args) 
	{
		int a=30;
		int b=5;
		int c=13;
		int small =(a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
		System.out.println(small);
	}
}
