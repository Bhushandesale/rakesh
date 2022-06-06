package practice_program;

public class palindrome 
{
    public static void main(String[] args)
  {
    int n=424,r;
    int temp=n;
    int sum=0;
    
    
   	while (n>0)
   	{
   		r=n%10;//123
   		sum=sum*10+r;//123
   		n=n/10;//32,3,0	
   	}
    if(temp==sum)	
    {
    System.out.println("Number is palindrome");	
    }
    else 
    {
    	System.out.println("No is not palindrome");
    }		
  }
}



