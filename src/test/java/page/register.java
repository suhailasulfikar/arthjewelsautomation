package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register {
	WebDriver driver;
	By register= By.xpath("//*[@id=\"shopify-section-header-2\"]/header/div[1]/div/div/div[3]/div[1]/div[1]/p[1]/a");
	By arthfirstname=By.xpath("//*[@id=\"RegisterForm-FirstName\"]");
	By arthlastname=By.xpath("//*[@id=\"RegisterForm-LastName\"]");
	By arthemail=By.xpath("//*[@id=\"RegisterForm-email\"]");
	By arthpass=By.xpath("//*[@id=\"RegisterForm-password\"]");
	By create=By.xpath("//*[@id=\"create_customer\"]/button");
	
	public register(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String pass)
	{
		driver.findElement(register).click();	
		driver.findElement(arthfirstname).sendKeys("suhaila");
		driver.findElement(arthlastname).sendKeys("sulfikar");
		driver.findElement(arthemail).sendKeys("suha@gmail.com");
		driver.findElement(arthpass).sendKeys("suhaaa");
		}
	public void login()
	{
	driver.findElement(create).click();
	}
	

}
