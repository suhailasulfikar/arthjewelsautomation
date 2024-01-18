package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.homepage;


public class homepagetest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void url()
	{
	driver.get("");
	}
	@Test
	public void testlogin() throws Exception
	{
	homepage ob=new 	homepage(driver);
	ob.homePageLogoCheck();
	ob.wait();
	
	
	}




}
