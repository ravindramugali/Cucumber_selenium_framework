package StepDefination;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/java/Features"},
		glue = {"StepDefination"},
		monochrome=true,
		plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedrerun.txt"}
		//tags ="@functional"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{

	  @Override	  
	  @DataProvider(parallel=true) 
	  public Object[][] scenarios() {
		  return super.scenarios(); 
	}
}



