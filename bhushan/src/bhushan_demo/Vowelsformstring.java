package bhushan_demo;

public class Vowelsformstring
{
 
	public static void main(String[] args) 
	{
		String str = new String("hell duniya");
		for(int i=0;i<str.length();i++) 
		{
			if( str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				System.out.println("given string contaion " + str.charAt(i) + " indx of vowel " + i);
			}
		}
		
	}
		
		
		
		
		
		
		
		
}