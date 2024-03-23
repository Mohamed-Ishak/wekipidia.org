package pages;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AccountLandingPage extends BasePage {

	public AccountLandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	
	By accountUserNameLink = By.cssSelector("#pt-userpage-2");
	By searchBar = By.id("searchInput");
	By searchBTN = By.cssSelector("form[id='searchform'] button");
	By articleTitle = By.cssSelector("#firstHeading span");
	By watchIcon = By.cssSelector("li[class='mw-watchlink mw-list-item']");
    
    By languagesDropdown = By.cssSelector("div[class='vector-dropdown mw-portlet mw-portlet-lang']");
    By LanguageSearchbar = By.xpath("//div[@class='uls-search-wrapper']/div/input[2]");
    By suggestedLang = By.cssSelector("li[title='Türkçe']");
    By languages =  By.cssSelector("div[class*='uls-language-list']");
    By turkLang = By.cssSelector("div[data-region='EU'] li[title='Türkçe']");
    By langHeader = By.cssSelector("#firstHeading span");
   
   
    
    By profileDropdow = By.cssSelector("div[id='vector-user-links-dropdown']");
    By preferences   =  By.cssSelector("li[id='pt-preferences']");
	
    
    By talk = By.id("ca-talk");
	By addTopic = By.id("ca-addsection");
	static By welcomeTxt = By.cssSelector("#firstHeading");

	public void clickOnUsernameLink() {
		driver.findElement(accountUserNameLink).click();
	}

	public String getWelcomeText() {

		String name = driver.findElement(welcomeTxt).getText();
		return name;
	}

	public void clickOnTalkLink() {
		driver.findElement(talk).click();
	}

	public void clickOnAddTopicLink() {
		driver.findElement(addTopic).click();
	}

	public void enterArticleTitleInSearchbar() {
		driver.findElement(searchBar).sendKeys("Artificial intelligence");
	}

	public void clickOnSearch() {
		driver.findElement(searchBTN).click();
	}

	public void clickOnAddToWatchIcon() {
		driver.findElement(watchIcon).click();
	}
	
	public void waitForSearchBTN() {
         waitForElementToBeVisible(searchBTN);
	}
	
	
	public void waitForWatchIcon() {
		waitForElementToBeVisible(watchIcon);
	}
	
	
	public void waitForSearchDropdown() {
		waitForElementToBeVisible(languagesDropdown);
	}

	public void clickOnLangauegDropdown() {
		driver.findElement(languagesDropdown).click();
	}
	
	public void waitForSearchbar() {
		waitForElementToBeVisible(LanguageSearchbar);
		
	}
	
	public void enterYourLanguage() {
		driver.findElement(LanguageSearchbar).sendKeys("Türkçe");
	}
	
	
	public void clickONTurkishOption() {
		driver.findElement(suggestedLang).click();
	}
	
	public String getLanguageHeader() {
	 	String langTxt = driver.findElement(langHeader).getText();
	 	
	 	return langTxt;
	}
	
	
	public void clickOnProfile() {
		driver.findElement(profileDropdow).click();
		
		
	}
	
	public void selectPreferences() {
		driver.findElement(preferences).click();
	}
	
	
	

}
