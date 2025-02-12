import java.util.Scanner;
class SquareRoot{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		boolean flag = false;
		 for(int i=1;i*i<=num;i++)
		 {
		 	if(i*i==num)
		 	{
		 		flag = true;
		 		System.out.println(i+" is a perfect square root for "+num);
		 		break;
		 	}
		 	if(i*i>num)
		 	break;

}
       if(!flag)
	System.out.println("num+ is not a perfect square");
}
}