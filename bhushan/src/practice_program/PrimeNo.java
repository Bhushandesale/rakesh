package practice_program;

public class PrimeNo 
{
public static void main(String[] args)
 {
	int no=13;
	int temp=0;
	for (int i=2;i<=no-1;i++)
	{
		if(no%i==0) 
		{
			temp=temp+1;
		}
		//System.out.println(temp);
	}
	 if (temp==0)
	 {
		System.out.println(no+ " Is a prime no");
	 }
	 else 
	 {
		System.out.println(no+" not is prime no");
	 }
 }
}
