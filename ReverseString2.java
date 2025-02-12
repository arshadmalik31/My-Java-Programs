class ReverseString2{
	public static void main(String[] args) 
	{
		String str = "ARSHAD MALLICK";
		String rev1 = "";
		for(int i=str.length()-1;i>=0;i--)
			rev1=rev1+str.charAt(i);
		System.out.println(rev1);
		
	}
}