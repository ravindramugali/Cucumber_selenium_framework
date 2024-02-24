package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends Base_page{
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
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
}
