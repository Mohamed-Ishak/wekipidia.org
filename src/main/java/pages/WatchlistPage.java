package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WatchlistPage extends BasePage{

	public WatchlistPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

private	By watchIconNavbar = By.id("pt-watchlist-2");
private	By viewAndEditWatchListLink = By.id("ca-special-specialAssociatedNavigationLinks-link-1");
private	By clearWatchlistLink = By.id("ca-special-specialAssociatedNavigationLinks-link-3");
private	By clearWatchlistBTN = By.id("ooui-php-2");
	By watchlistArticle = By.id("editwatchlist-ns0");
private	By clearedSuccessTxt = By.xpath("//div[@id='mw-content-text']");
	public void userNavigateToWatchlistPage() {
		driver.findElement(watchIconNavbar).click();
	}
	
	public void viewWatchlist() {
		driver.findElement(viewAndEditWatchListLink).click();
	}
	
	public void clearWarchlist() {
		driver.findElement(clearWatchlistLink).click();
		driver.findElement(clearWatchlistBTN).click();
	}
	
	public String getClearSuccessMessage() {
	  String successMessage =	driver.findElement(clearedSuccessTxt).getText();
	  return successMessage;
	}
	
	public void waitForWatchlistToBeVisible() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewAndEditWatchListLink));
	}
	

}
