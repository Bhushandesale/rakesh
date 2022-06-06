package bhushan_demo;

public class TryandCatch 
{ 
	public static void main(String[] args)
	{
		int a=6;
		int b=8;
		int c=0;
		int j[]= {1,2,3,4};
		
		try 
		{
			System.out.println(j[5]);
			//int d= a/c;
			//System.out.println(d);
		}
      catch(Exception e)
		{
			// int f=a+b;
			 //System.out.println(f);
			 
    	  int d= a/c;
    	  System.out.println(d);
		}
		finally 
		{
			System.out.println(b);
		}
		}
		
		{
	}

}
