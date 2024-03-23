package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountLandingPage;
import pages.PereferencesPage;
import tests.BaseTest;

public class PereferencesSteps extends BaseTest {

	AccountLandingPage landingPage;
	PereferencesPage preferencePage;

	@Given("User Open profile dorpdown")
	public void user_open_profile_dorpdown() {
		landingPage = new AccountLandingPage(driver);
		landingPage.clickOnProfile();
	}

	@When("User select Preferences option")
	public void user_select_preferences_option() {
		landingPage.selectPreferences();
	}

	@When("User Scroll down to URL to external Profiles textarea")
	public void user_scroll_down_to_url_to_external_profiles_textarea() {
		preferencePage = new PereferencesPage(driver);
		preferencePage.waitForURLToExternalProfileTextAreaToBePresent();
		preferencePage.scrollDownToTextArea();
	}

	@When("User Enter some links")
	public void user_enter_some_links() {
		preferencePage.enterExternalUTL();
	}

	@When("User click Save button")
	public void user_click_save_button() {
		preferencePage.clickOnSaveButton();
	}

	@Then("Links are saved successfully")
	public void links_are_saved_successfully() {
		Assert.assertTrue(preferencePage.getTextAreaContent().contains("mohamed-ishak"));
	}

//	@Then("close browser")
//	public void closeBrowser() {
//		preferencePage.closeBrowser();
//	}

}
