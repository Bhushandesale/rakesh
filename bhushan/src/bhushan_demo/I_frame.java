package bhushan_demo;




import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_frame  
{


public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
	
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]")).click();
	ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(2000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(2000);
	WebElement Button= driver.findElement(By.xpath("//button[text()='Try it']"));
	Button.click();
	Thread.sleep(2000);
    
	
	Alert alt=driver.switchTo().alert();
	alt.accept();
	
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	Thread.sleep(2000);
	 driver.switchTo().window(addr.get(0));
	
}
}
