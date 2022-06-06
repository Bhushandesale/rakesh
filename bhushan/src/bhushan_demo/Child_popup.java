package bhushan_demo;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/js_popup.asp");
	    
	    driver.manage().window().maximize();
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]")).click();
	    ArrayList<String>addr = new  ArrayList<String>( driver.getWindowHandles());
	    Thread.sleep(2000);
	   // String f=addr.get(0);
	    String mainaddr=driver.getWindowHandle();
	    System.out.println(mainaddr);
	    for (int i=0;i<addr.size();i++)
	    {
	    	String d=addr.get(i);
	    	driver.switchTo().window(d);
	    	String url=driver.getCurrentUrl();
	    	System.out.println(d +" "+ url);
	    
	    
	    
	    }}	    
	    
}
