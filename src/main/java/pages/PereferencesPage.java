package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PereferencesPage extends BasePage{

	public PereferencesPage(WebDriver driver) {
		super(driver);
		
	}
	 
    By textArea = By.cssSelector("textarea[id='ooui-php-57']");
	By saveBTN  = By.cssSelector("button[value='Save']");
    public void waitForURLToExternalProfileTextAreaToBePresent() {
		waitForElementToBeVisible(textArea);
	}
    
    public void scrollDownToTextArea() {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	WebElement fieldSet = driver.findElement(textArea);
    	js.executeScript("arguments[0].scrollIntoView(true);", fieldSet);
    }
    
    public void enterExternalUTL() {
    	driver.findElement(textArea).sendKeys("https://www.linkedin.com/in/mohamed-ishak-%F0%9F%87%B5%F0%9F%87%B8-4a160a163/");
    	
    }
    
    public void clickOnSaveButton() {
    	driver.findElement(saveBTN).click();
    }
    
    public String getTextAreaContent() {
     String url =	driver.findElement(textArea).getText();
     return url ;
    }

	public void closeBrowser() {
		driver.quit();
	}
}
