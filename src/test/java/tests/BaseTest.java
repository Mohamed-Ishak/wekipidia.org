package tests;




import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
//         ChromeOptions options = new ChromeOptions();
//         options.addArguments("--headless");
		//To Run In headless mode pass options as a parameter in chromeDriver(options) 
		
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().window().maximize();
	     driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
	}
	
	@AfterMethod
	public void teardownDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
    // Take a screen shot
	public void takeScreenShot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\src\\screenshot.png"));
	}

	

}
