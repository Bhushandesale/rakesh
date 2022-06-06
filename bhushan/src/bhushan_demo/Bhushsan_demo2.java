package bhushan_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bhushsan_demo2
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.facebook.com");
     Thread.sleep(1000);
    /* driver.navigate().to("https://web.whatsapp.com");
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     String url=driver.getCurrentUrl();
     System.out.println(url);
     String Title= driver.getTitle();
     System.out.println(Title);
     Thread.sleep(2000);*/
    driver.manage().window().maximize();
    
   Thread.sleep(4000);
    WebElement user = driver.findElement(By.xpath("//a[text()='Create New Account']"));
   user.click();
    
    Thread.sleep(1000);
    WebElement user1 = driver.findElement(By.xpath("//input[@name='firstname']"));
    user1.sendKeys("Bhushan");
    
    
    Thread.sleep(1000);
    WebElement user2 = driver.findElement(By.xpath("//input[@name='lastname']"));
    user2.sendKeys("Patil");
    
    
    Thread.sleep(2000);
    WebElement user3 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
    user3.sendKeys("7057672008");
    
    Thread.sleep(2000);
    WebElement user8 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
    user8.sendKeys("//input[@name='reg_passwd__']");
    
    
    Thread.sleep(2000);
    WebElement user4 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Select a=new Select(user4);
    a.selectByIndex(2);
    
    Thread.sleep(2000);
    WebElement user5=driver.findElement(By.xpath("//select[@name='birthday_month']"));
    Select b=new Select(user5);
    b.selectByIndex(2);
    
    Thread.sleep(2000);
    WebElement user6= driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select o=new Select(user6);
    o.selectByValue("2019");
    
    Thread.sleep(2000);
    WebElement user7 =driver.findElement(By.xpath("//label[text()='Male']"));
    user7.click();
    
    Thread.sleep(2000);
    WebElement user9 =driver.findElement(By.xpath("//Button[@name='websubmit']"));
   user9.click();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
