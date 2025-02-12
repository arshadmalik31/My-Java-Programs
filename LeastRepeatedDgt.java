class LeastRepeatedDgt{
public static void main(String[] args) {
	int num=444499922;
	int min=9;
	int dgt=0;

	for(int i=0;i<=9;i++){
		int cnt=0;
		for(int j=num;j>0;j/=10){

			int rem=j%10;
			if(i==rem)
				cnt++;
		}
		if(cnt!=0){
			if(min>cnt){
				min=cnt;
				dgt=i;
			}
		
	}
}
System.out.println("min digit is "+dgt+ "with a frequeny of "+min);
}
}