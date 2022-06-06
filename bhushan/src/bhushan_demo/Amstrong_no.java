 package bhushan_demo;

public class Amstrong_no 
{ public static void main(String[] args) 
{
	int number;
	int a,b,c,d,j;
	number=1463;
	a=1;b=4;c=6;d=3;;
	
	j= a*a*a*a+b*b*b*b+c*c*c*c+d*d*d*d;
	
	if(j==number)
	{
		System.out.println(number+"is amstrong no");
	}
	else
	{
		System.out.println (number +"is not amstrong no");
	}
	number=0;
}

}
