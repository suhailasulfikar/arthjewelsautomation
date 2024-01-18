package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.register;

public class registertest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
	driver=new ChromeDriver();	
	driver.get("https://arthjewels.com/");
	}
	@Test
	public void test()
	{
		register ob=new register(driver);
		ob.setvalues("suha@gmail.com", "suhaaa");
		ob.login();
	}

}
