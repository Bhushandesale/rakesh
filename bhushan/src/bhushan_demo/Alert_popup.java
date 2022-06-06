package bhushan_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
public static void main(String[] args) throws InterruptedException
{

	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    Alert alt=driver.switchTo().alert();
	    Thread.sleep(2000);
	   alt.accept();
	   Thread.sleep(5000);
	   //String s= alt.getText();
	 //  System.out.println("s");
	 //  Thread.sleep(2000);
	   alt.dismiss();
}  
}
}