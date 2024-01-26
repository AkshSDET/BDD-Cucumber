package Stepdefinations;

import java.util.Properties;

import Driverfactory.DriverFactory;
import Pagefactory.Signup_PF;
import io.cucumber.java.en.*;

public class Signupsteps {

	Signup_PF signup = new Signup_PF(DriverFactory.getDriver());
	public static ConfigReader reader = new ConfigReader();
	public static Properties pro = reader.init_prop();

	@Given("user is on the Login page")
	public void user_enter_the_url() throws InterruptedException {
		DriverFactory.getDriver().get(pro.getProperty("URL"));
		Thread.sleep(2000);
	}

	@And("user clicks on create profile page")
	public void user_clicks_on_create_profile_page() throws InterruptedException {
		signup.clickonregister();
	}

	@When("user enter the registration details")
	public void user_enter_the_registration_details() {
		signup.enterregistrationdetails();
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		signup.clickonsubmit();
	}

	@Then("user return to home page")
	public void user_return_to_home_page() {
		signup.clickonlogout();
	}
}

