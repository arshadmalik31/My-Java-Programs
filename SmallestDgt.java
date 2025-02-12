class SmallestDgt{
	public static void main(String[] args) {
		int num=475628724;
		int min=8;
		for(int i=num;i>0;i/=10)
		{
			int dgt=i%10;
			if(min>dgt)

				min=dgt;
		}
		
			System.out.println("smallest dgt from "+num+" is "+min);
		}
	}
