package Pagefactory;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepdefinations.ConfigReader;

public class Login_PF {

	@FindBy(name = "username")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(xpath = "//input[@value='Log In']")
	WebElement Login;

	@FindBy(xpath = "//h2[normalize-space()='Customer Login']")
	WebElement title;

	@FindBy(xpath = "//b[@class='ng-binding']")
	WebElement Amount;

	public WebDriver driver;
	public static ConfigReader reader = new ConfigReader();
	public static Properties pro = reader.init_prop();


	public Login_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void entercred() {
		Username.sendKeys(pro.getProperty("username"));
		Password.sendKeys(pro.getProperty("password"));
	}

	public void clickonlogin() throws InterruptedException {
		if(Login.isDisplayed()){
			Login.click();
		}
		Thread.sleep(2000);
	}

	public void verifytitle() {
		String actualtitle = title.getText();
		String expectedtitle = "Customer Login"; 
		Assert.assertEquals(actualtitle, expectedtitle);
	}

	public void displayamount() {
		String amounts = Amount.getText();
		System.out.println("User is on the Dashboard and displayed amount is  "+amounts);

	}

}
