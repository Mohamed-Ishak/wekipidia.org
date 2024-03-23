package tests;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseTest extends AbstractTestNGCucumberTests{

        public static  WebDriver driver ;
	
	@BeforeMethod
	public void setupDriver() {
//	     ChromeOptions options = new ChromeOptions();
//	     options.addArguments("--headless");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	

	
	@AfterMethod
	public void teardownDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
//	
	

}
