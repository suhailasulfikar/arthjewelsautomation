package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.signin;

public class signintest {
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
			signin ob=new signin(driver);
			ob.setvalues("suha@gmail.com", "abcde");
			ob.login();
			ob.verify_title();
			ob.scroll();
		}

}
