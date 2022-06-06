package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1  
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	LoginPage login= new LoginPage(driver);
	 login.sendusername();
	 login.sendpassword();
	 login.SubmitButton();
	
}
}
