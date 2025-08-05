package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends Base_page{
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	private WebElement submit;
	
	private WebDriver driver;
	
	public Login_page(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void user_name(String un) {
		sendkeys(username,un);
	}
	
	public void pass_word(String pwd) {
		sendkeys(password,pwd);
	}
	public void submitbtn() {
		submit.click();
	}
	
	// page chaining we can create which nagigates to next page
	/*
	 * public HomePage navigatetoHomepage() {
	 * user_name(un); pass_word(pwd);
	 * submitbtn(); 
	 * return new Homepage(driver); 
	 * }
	 */
}
