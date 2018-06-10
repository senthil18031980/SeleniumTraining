/*package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepsCreateLead {

	public static RemoteWebDriver driver;
		
	@Given("Invoke Leaftap Application")
	public void invokApp() {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://leaftaps.com/opentaps/");
	}

	@And("Enter the UserName as (.*)")
	public void enterusername(String uName) {
	driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)")
	public void enterpassword(String password) {
	driver.findElementById("password").sendKeys(password);
	}
	
	@And("Click on Login Button")
	public void clickonlogin() {
	driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("Verify the Login is sucess")
	public void verifylogin() {
	System.out.println("Login is successful");
//	driver.findElementByXPath("//*[@id=\"form\"]/h2");
	}
	
	@And("Click on crmsfa Link")
	public void clickoncrmsfalink() {
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on Leads Tab")
	public void clickonleadstab() {
	driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click on Create Lead")
	public void clickoncreatelead() {
	driver.findElementByLinkText("Create Lead").click();
	}
	
		
	@And("Enter the Company Name as (.*)")
	public void entercompanyname(String cName) {
	driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And("Enter the First Name as (.*)")
	public void enterfirstname(String fName) {
	driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter the Last Name as (.*)")
	public void enterlastname(String lName) {
	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@And("Click on CreateLead button")
	public void clickoncreateleadbutton() {
	driver.findElementByName("submitButton").click();
	}
	
	@Then("Verify the Lead Page")
	public void verifyleadpage() {
	System.out.println("Lead page is created successfully");
//	driver.findElementByClassName("decorativeSubmit").click();
	}
}
*/