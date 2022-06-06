package bhushan_demo;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_orangeHRM 
{public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com");
	
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Point p= new Point(500,600);
	driver.manage().window().setPosition(p);
	driver.manage().window().minimize();
	driver.getCurrentUrl();
	System.out.println("Url");
	Thread.sleep(2000);
	WebElement user1= driver.findElement(By.xpath("//input[@id='txtUsername']"));
	user1.sendKeys("Admin");
	  
	Thread.sleep(2000);
	WebElement user2= driver.findElement(By.xpath("//input[@id='txtPassword']"));
	user2.sendKeys("admin123");
	Thread.sleep(2000);
	WebElement user3= driver.findElement(By.xpath("//input[@id='btnLogin']"));
	user3.click();
	 Thread.sleep(2000);
	 driver.close();
	    Thread.sleep(2000);
	      driver.quit();

	
}
	
	
}


