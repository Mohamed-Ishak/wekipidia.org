package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	By userName = By.id("wpName1");
	By password = By.id("wpPassword1");
	By loginBTN = By.id("wpLoginAttempt");
	
	
	public void enterEmailAndPassword(String email , String pass) {
		driver.findElement(userName).sendKeys(email);
		driver.findElement(password).sendKeys(pass);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginBTN).click();
	}
	

}
