package bhushan_demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot{



public static void main(String[] args) throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
//	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File dest =new File("C:\\Users\\admin\\Downloads\\New folder.jpeg");
//	FileHandler.copy(source, dest);
    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("test-output"+File.separator+"testScreenshots"+File.separator+"Test_"+"testID"+"Date and Time"+".jpg");
	FileHandler.copy(source, dest);
}
}
