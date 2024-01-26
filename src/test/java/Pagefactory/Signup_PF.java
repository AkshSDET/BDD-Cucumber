package Pagefactory;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Stepdefinations.ConfigReader;

public class Signup_PF {

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement Register; 

	@FindBy(xpath = "//input[@id='customer.firstName']")
	WebElement Firstname;

	@FindBy(id = "customer.lastName")
	WebElement Lastname;

	@FindBy(id="customer.address.street")
	WebElement Address;

	@FindBy(id ="customer.address.city")
	WebElement City;

	@FindBy(id ="customer.address.state")
	WebElement State;

	@FindBy(id ="customer.address.zipCode")
	WebElement Zipcode;

	@FindBy(id ="customer.phoneNumber")
	WebElement Phonenumber;

	@FindBy(id= "customer.ssn")
	WebElement SSN;

	@FindBy(id ="customer.username")
	WebElement Username;

	@FindBy(id ="customer.password")
	WebElement Password;

	@FindBy(id ="repeatedPassword")
	WebElement Confirm;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement Submit;

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement Logout;


	WebDriver driver;
	public static ConfigReader reader = new ConfigReader();
	
	public static Properties pro = reader.init_prop();

	//To initialize the elements
	public Signup_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}


	//Actions
	public void clickonregister() throws InterruptedException {
		Thread.sleep(2000);
		Register.click();
	}

	public void enterregistrationdetails() {
		Firstname.sendKeys(pro.getProperty("firstname"));
		Lastname.sendKeys(pro.getProperty("lastname"));
		Address.sendKeys(pro.getProperty("address"));
		City.sendKeys(pro.getProperty("city"));
		State.sendKeys(pro.getProperty("state"));
		Zipcode.sendKeys(pro.getProperty("zipcode"));
		Phonenumber.sendKeys(pro.getProperty("phonenumber"));
		SSN.sendKeys(pro.getProperty("ssn"));
		Username.sendKeys(pro.getProperty("username"));
		Password.sendKeys(pro.getProperty("password"));
		Confirm.sendKeys(pro.getProperty("confirm"));
	} 

	public void clickonsubmit() {
		Submit.click();
	} 

	public  void clickonlogout() {
		if(Logout.isDisplayed()){
			Logout.click();
		}

	} 
}

