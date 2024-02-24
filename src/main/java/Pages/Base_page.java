package Pages;

import org.openqa.selenium.WebElement;

public class Base_page {
	
	public void sendkeys(WebElement e,String data) {
		e.sendKeys(data);
	}
	

}
