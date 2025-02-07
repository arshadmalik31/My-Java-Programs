import java.util.Scanner;
class Vowels2 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter UserName: ");
	String s=sc.next().toUpperCase();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				System.out.println(s.charAt(i));
			}

		}
		
	}
}
