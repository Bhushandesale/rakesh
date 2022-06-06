package pom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassTNG

{
	@BeforeClass
public void beforeClass()
{
		System.out.println("beforeClass");
} 
	@BeforeMethod
	public void method()
	{
		System.out.println("beforeMethod");
	}
	@Test(priority =1)
	public void TestCaseB()
	{
		System.out.println("testA");
		
	}
	@Test(priority =2)
	public void TestCaseA()
	{
		System.out.println("testcase2");
	}
	@Test
	public void TestCaseC()
	{
		System.out.println("testcase2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("afterclass");
	}
}
