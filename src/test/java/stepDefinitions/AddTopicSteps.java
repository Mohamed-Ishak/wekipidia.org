package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountLandingPage;
import tests.BaseTest;

public class AddTopicSteps extends BaseTest{
	AccountLandingPage landingPage ;
	@When("User click on Talk link")
	public void userClickOnTalkLink() {
     landingPage = new AccountLandingPage(driver);
     landingPage.clickOnTalkLink();	 
	}

	@When("user click on Add topic link")
	public void userClickAddTopicLink() {		
     landingPage.clickOnAddTopicLink();
	}

	@Then("user can add new Topic")
	public void userCanAddNewtopic() {
    
	}


}
