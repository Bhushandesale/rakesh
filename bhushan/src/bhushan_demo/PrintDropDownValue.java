package bhushan_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropDownValue 
{
  public static void main(String[] args) 
  {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://demo.automationtesting.in/Register.html");
	 driver.manage().window().maximize();
	 WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
	 Select sel=new Select(element);
	 List <WebElement> dd_option=sel.getOptions();
	 
	 int i=1;
	 for (WebElement E : dd_option) 
	 {
		System.out.println(i+"."+E.getText());
		i++;
		
	}
	 
	 
	 
	 
} 
}
