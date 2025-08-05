package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	
	public WebDriver init_Driver(String browser) {
		/* here using webdrivermanager no need to set property
		 * it will only take care everything
		 */
		
		if(browser.equalsIgnoreCase("Chrome")) {
			/* this code is as per webdriver version 4.0 but in 5.0 and above version no
			*nee to write new Chromedriver();
			* driver=WebDriverManager.chromedriver().capabilities(cap).create();// here it is taking desired capabilities
			* tldriver.set(driver);
			*/
			//WebDriverManager.chromedriver().capabilities(cap).setup();
			//sample comment in 4th aug 2025
			
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
									 
		}	
		return getDriver();
	}
	
	
	public static synchronized WebDriver getDriver() { 
		return tldriver.get(); }
	 

}
