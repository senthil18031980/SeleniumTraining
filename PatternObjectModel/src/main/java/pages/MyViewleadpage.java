package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyViewleadpage extends ProjectMethods {

	public MyViewleadpage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
		
	public MyViewleadpage verifyFirstName(String data) {
		verifyExactText(eleVerifyFirstName, data);
		return this;
	
	}

}
