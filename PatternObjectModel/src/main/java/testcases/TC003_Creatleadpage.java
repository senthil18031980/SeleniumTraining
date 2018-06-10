package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Creatleadpage extends ProjectMethods {




	@BeforeTest
	public void setData() {
		testCaseName="TC003_Creatleadpage";
		testDescription="Enter Mandatory feilds as Company name, First name, Last name and create Lead";
		testNodes="CreateLead";
		category="Smoke";
		authors="Senthil";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void Creatleadpage(String uName,String pwd,String cName,String fName,String lName, String vfName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMLink()
		.clickLeads()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreatleadSubmitLink()
		.verifyFirstName(vfName);
		

	}
}
