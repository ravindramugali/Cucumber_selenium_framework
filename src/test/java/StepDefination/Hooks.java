package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Factory.Driverfactory;
import Utils.ConfigReader;
import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends ConfigReader{
	
	private Driverfactory driverfactory;
	private WebDriver driver;

	@Before
	public void launchBrowser() {
	
		ConfigReader pro=new ConfigReader();
		String browsername=pro.propRead();
		
		driverfactory=new Driverfactory();
		driver=driverfactory.init_Driver(browsername);
		
		System.out.println("-------------------before hook-----------------");	
		
	}
	
	@After(order = 1)
	public void screenshotcapture(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}
	
	@After(order = 0)
	public void teardown() {
		
		driver.quit();
		System.out.println("-------------------After hook-----------------");	
		
	}
	
}
