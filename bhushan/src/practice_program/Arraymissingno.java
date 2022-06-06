package practice_program;

public class Arraymissingno
{

public static void main(String[] args) 
{
	int a[]= {1,2,4,5};
	int sum =0;
	for( int i=0; i<a.length; i++) 
	{
		sum=sum+a[i];//1+2
	}
	 System.out.println(sum);
	 
	 
	   int sum1=0;
	   for(int j=1; j<=5; j++)
	   {
	    sum1= sum1+j;
	   }
	
	System.out.println(sum1);
	
	System.out.println("missing no is::"+(sum1-sum));
	
   }
}

//	 public static int
//	    findDisappearedNumbers(int[] nums)
//	    {
//	        int n=nums.length;
//	        int sum=((n+1)*(n+2))/2;
//	        for(int i=0;i<n;i++)
//	          sum-=nums[i];
//	        return sum;
//	    }
//	    public static void main(String[] args)
//	    {
//	        int[] a = { 1, 2, 4, 5, 6 };
//	        System.out.println(findDisappearedNumbers(a));
//	    }
//	}





