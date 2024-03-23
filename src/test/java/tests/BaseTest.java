package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;


import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseTest extends AbstractTestNGCucumberTests{

        public static  WebDriver driver ;
	

	@BeforeTest
	public void setupDriver() {
	     
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	

	
//	@AfterTest
//	public void teardownDriver() {
//		if(driver != null) {
//			driver.quit();
//		}
//	}
	
	

}
