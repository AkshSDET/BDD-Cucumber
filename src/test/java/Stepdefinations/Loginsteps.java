package Stepdefinations;

import java.util.Properties;

import Driverfactory.DriverFactory;
import Pagefactory.Login_PF;
import io.cucumber.java.en.*;

public class Loginsteps{

	Login_PF login = new Login_PF(DriverFactory.getDriver());
	public static ConfigReader reader = new ConfigReader();
	public static Properties pro = reader.init_prop();

	@Given("user is on the home page") 
	public void user_is_on_the_home_page()  {
		DriverFactory.getDriver().get(pro.getProperty("URL"));
		login.verifytitle();
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		login.entercred();
	}

	@And ("click on submit")
	public void click_on_submit() throws InterruptedException {
		login.clickonlogin();
	}

	@Then("user is navigate to the Dashboard")
	public void user_is_navigate_to_the_dashboard() {
		login.displayamount();
	}
}
