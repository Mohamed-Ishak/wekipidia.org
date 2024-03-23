package stepDefinitions;


import io.cucumber.java.en.When;
import pages.AccountLandingPage;
import tests.BaseTest;

public class ChangeLanguageSteps extends BaseTest{

	
	AccountLandingPage landingPage;
	@When("User click Languages dropdown")
	public void user_click_languages_dropdown() {
       landingPage = new AccountLandingPage(driver);
       landingPage.waitForSearchDropdown();
       landingPage.clickOnLangauegDropdown();
	}

	@When("User Enter a langauge name in the dropdown searchbar")
	public void user_enter_a_langauge_name_in_the_dropdown_searchbar() throws InterruptedException {
		landingPage.waitForSearchbar();
      //   landingPage.EnterLanguageName();
	}

//	@When("User selected from suggestion dropdown")
//	public void user_selected_from_suggestion_dropdown() {
//          landingPage.SelectedTheSuggestedOption();
//	}

//	@Then("The Lanuguage is changed successfully")
//	public void the_lanuguage_is_changed_successfully() {
//	
//	}
}
