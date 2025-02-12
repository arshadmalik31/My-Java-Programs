class StringPalindrome{
	public static void main(String[] args) {
		String str = "ARSHAD";
		String rev = "";
		for(int i=0;i<str.length(); i++)

			rev = str.charAt(i)+rev;

           if(str.equals(rev))
		{
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("string is not a palindrome");
		
		}
	}

	}
