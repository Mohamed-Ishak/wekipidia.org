package stepDefinitions;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountLandingPage;
import pages.LoginPage;
import pages.MainPage;
import tests.BaseTest;

public class LoginSteps extends BaseTest{


	MainPage mainPage ;
	LoginPage loginPage ;
	AccountLandingPage landingPage ;
	@Given("User navigate wekipedia main page")
	public void userNavigateToWekipediaMainPage() {
     
	}

	@When("User click on login link")
	public void userClickOnLoginLink() {
		mainPage = new MainPage(driver);
		mainPage.clickOnLoginLink();
	}

	@When("Enter valid {string} and {string}")
	public void userEnterValidUsernameAndPassword(String email, String password) {
		loginPage = new LoginPage(driver);
		loginPage.enterEmailAndPassword(email, password);
	}

	@When("User click on login")
	public void userClickOnLoginButton() {
       loginPage.clickOnLoginButton();
	}

	@Then("User logged into his account successfully")
	public void userLoggedIntoHisAccountSuccessfully() throws InterruptedException {
		landingPage = new AccountLandingPage(driver);	
		landingPage.clickOnUsernameLink();
		Assert.assertEquals(landingPage.getWelcomeText(), "Hello, ‪MoIshak‬!");
	}
}
