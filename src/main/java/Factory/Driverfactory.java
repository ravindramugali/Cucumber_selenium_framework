package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	
	public WebDriver init_Driver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup(); 
			tldriver.set(new ChromeDriver());
									 
		}	
		return getDriver();
	}
	
	
	public static synchronized WebDriver getDriver() { 
		return tldriver.get(); }
	 

}
