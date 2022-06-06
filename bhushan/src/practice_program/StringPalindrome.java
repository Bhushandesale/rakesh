package practice_program;

public class StringPalindrome 
{
 public static void main(String[] args) 
 {
	String rev="";
	String s = "nitin ";
	for (int i=s.length()-1; i>=0;i--) 
	{
		rev= rev + s.charAt(i);
	}
	
	//System.out.println(rev); 
	if(s.equals(rev)) 
	{
		System.out.println("string is palindrome");
	}
	else 
	{
		System.out.println("string is not palindrome");
		
	}	 
 }
}
