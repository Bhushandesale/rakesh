package bhushan_demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parmetarization 
{
  public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
	Thread.sleep(2000);
	List<WebElement> tableData=driver.findElements(By.xpath("//table[@id='customers']"));
	String cellvalue= tableData.get(1).getText();
	System.out.println(cellvalue);
	
	
}
}
