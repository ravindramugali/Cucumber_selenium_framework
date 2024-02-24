package StepDefination;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Factory.Driverfactory;
import Pages.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginDef {
	
	Login_page login=new Login_page(Driverfactory.getDriver());
	public static Logger log=LogManager.getLogger(loginDef.class);
	
	@Given("open url")
	public void open_url() {
		Driverfactory.getDriver().get("http://www.facebook.com");				
	}
	   
	@When("enter username and password")
	public void enter_username_and_password() throws InterruptedException {
		login.user_name("ravindramugali@gmail.com");
		login.pass_word("8904161624");
		Thread.sleep(5000);
		log.info("----------------log4j--------------------------------");
		//Driverfactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	@When("enter {string} and password")
	public void enter_username_and_passwordwith(String un) throws InterruptedException {
		login.user_name(un);
		login.pass_word("8904161624");
		Thread.sleep(5000);
		log.warn("-----warning log4j-----------");
		//Driverfactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	@Then("verify page title")
	public void verify_page_title() {
	   login.submitbtn();
		
	}
	@Then("verify title")
	public void verify_title() {
	   Assert.assertTrue(false);
		
	}


}
