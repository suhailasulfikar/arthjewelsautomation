package page;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {
WebDriver driver;
	
	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public @FindBy (xpath = "//*[@id=\"shopify-section-header-2\"]/header/div[1]/div/div/div[2]/a[1]/img") WebElement homePageLogo;
	
	public Boolean homePageLogoCheck() {
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		explicitWait.until(ExpectedConditions.visibilityOfAllElements(homePageLogo));
		boolean b = homePageLogo.isDisplayed();
		return b;
	}
	
	
	public void screenShot(WebElement element, String screenshotName) throws Exception {
		
		File companyLogo = homePageLogo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(companyLogo, new File("\"C:\\Users\\user\\Desktop\\su.png"));
		
	}
	
	

}
