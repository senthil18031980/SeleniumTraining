package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyCreateleadpage extends ProjectMethods {

	public MyCreateleadpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
		
	@And ("Enter the Company Name as (.*)")
	public MyCreateleadpage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}	
		
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@And ("Enter the First Name as (.*)")
	public MyCreateleadpage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;	
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@And ("Enter the Last Name as (.*)") 
	public MyCreateleadpage enterLastName(String data) {
		type(eleLastName, data);
		return this;	
	
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement elecreatelead;
	
	@And ("Click on CreateLead button")
	public MyViewleadpage clickCreatleadSubmitLink() {
		click(elecreatelead);
		return new MyViewleadpage();

	}

}
