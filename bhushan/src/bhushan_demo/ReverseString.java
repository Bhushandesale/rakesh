package bhushan_demo;

public class ReverseString 
{
public static void main(String[] args)
{
	String a= "Bhushan" ;
	StringBuffer f= new StringBuffer (a);
	f.reverse();
	System.out.println(f);
	
	String c,d,e,b,m;
	c= "RED_Yellow_Blue";
	d=c.substring(0, 3);
	e =c.substring(4, 10);
	b=c.substring(11, 15);
	char g=c.charAt(0);
	System.out.println(g);
	System.out.println(d+" "+e+" "+b);
	m=c.concat (a);
	System.out.println(m);
	
	
	
}
}
