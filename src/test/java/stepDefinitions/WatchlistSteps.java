package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountLandingPage;
import pages.MainPage;
import pages.WatchlistPage;
import tests.BaseTest;

public class WatchlistSteps extends BaseTest{

	
	AccountLandingPage landingPage ;
	WatchlistPage watchlistPage ;
	MainPage mainPage;
	@Given("User Enter a title in the search bar")
	public void userEnterAtitleInTheSearchbar() {
		landingPage = new AccountLandingPage(driver);
		landingPage.enterArticleTitleInSearchbar();
	}
	
	@When("User click on search button")
	public void user_click_on_search_button() {
		landingPage.waitForSearchBTN();
        landingPage.clickOnSearch();
	}
	
	@When("User click on add to watchlist icon")
	public void user_click_on_add_to_watchlist_icon() {
       
       landingPage.clickOnAddToWatchIcon();
	}

	@When("User naviage to watchlist page")
	public void user_naviage_to_watchlist_page() {
		watchlistPage = new WatchlistPage(driver);
		watchlistPage.userNavigateToWatchlistPage();
	}

	@When("User view the watchlist")
	public void user_view_the_watchlist() {
	 watchlistPage.waitForWatchlistToBeVisible();
     watchlistPage.viewWatchlist();
     	
	}

	@Then("User can clear the watchlist")
	public void user_can_clear_the_watchlist() {
	watchlistPage.clearWarchlist();
     Assert.assertTrue(watchlistPage.getClearSuccessMessage().contains("Your watchlist has been cleared"));
	}
	


	
	
}
