package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class Myhomepage extends ProjectMethods {

	public Myhomepage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleleadsLink;
	
	@And ("Click on Leads Tab")
	public Myleadpage clickLeads() {
		click(eleleadsLink);
		return new Myleadpage();
		
		
	}

}
