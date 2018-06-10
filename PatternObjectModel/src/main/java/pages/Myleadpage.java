package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class Myleadpage extends ProjectMethods {

	public Myleadpage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreatelead;
	
	@And ("Click on Create Lead")
	public MyCreateleadpage clickCreateLeadLink() {
		click(elecreatelead);
		return new MyCreateleadpage();
		
		
	}

}
