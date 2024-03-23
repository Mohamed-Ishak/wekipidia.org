package runners;


import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features = "src/test/java/features",glue = "stepDefinitions")
public class TestRunner extends BaseTest{

}