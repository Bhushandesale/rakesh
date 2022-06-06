package bhushan_demo;

public class Amstrong_whileloop
{
	public static void main(String[] args)
	{
		int sum =0,n,b;
		System.out.print("amstorng no form 1 to 1000");
		for(int i=1;i<=50000;i++)
	{
		n=i;
		while(n>0)
		{
			b=n%10;
			sum =sum+(b*b*b);
			n=n/10;
		}
		if(sum==i) 
		{	
			System.out.println(i+" ");
		}  
		sum=0;
	}
	}

}
