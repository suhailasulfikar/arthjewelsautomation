package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class signin {
	WebDriver driver;
	By signin=By.xpath("//*[@id=\"shopify-section-header-2\"]/header/div[1]/div/div/div[3]/div[1]/div[1]/p[2]/a");
	By arthemail=By.id("CustomerEmail");
	By arthpass=By.xpath("CustomerPassword");
	By submit=By.xpath("//*[@id=\"customer_login\"]/button");
	
	public signin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String email,String pass)
	{
		driver.findElement(signin).click();	
		driver.findElement(arthemail).sendKeys("suha@gmail.com");
		driver.findElement(arthpass).sendKeys("suha");

}
	public void login()
	{
	driver.findElement(submit).click();
	}
	
	public void verify_title()
	{
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Arthjewels";
		Assert.assertEquals(act_title, exp_title);
	}
	public void scroll()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(submit).click();
	}

}


