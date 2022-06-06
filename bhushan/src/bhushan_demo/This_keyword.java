package bhushan_demo;

public class This_keyword
{
     int a=10;
     int b=13;
   public void sample (int a,int b) 
   {
	   this.a=a;
	   this.b=b;
	   System.out.println(a);
	   System.out.println(b);
	   
   }
public static  void main(String[] args) 
{
      This_keyword s = new This_keyword();
      s.sample(20,15);
}

}
