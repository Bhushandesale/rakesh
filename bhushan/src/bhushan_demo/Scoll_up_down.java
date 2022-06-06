package bhushan_demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scoll_up_down 
{
public static void main(String[] args) throws InterruptedException
{ 
	System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	JavascriptExecutor js=(JavascriptExecutor)driver;
			//for(int i=1;i<9;i++)
	{
	js.executeScript("Window.scrollBy(0,1000)", args);
				Thread.sleep(2000);
			}
			
}
}
