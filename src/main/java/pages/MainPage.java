package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
		
	}
	
	By loginLink = By.id("pt-login-2");
    
	
	public void clickOnLoginLink() {
		driver.findElement(loginLink).click();
	}
	

    
}
