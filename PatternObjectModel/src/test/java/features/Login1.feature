Feature: Login and Create lead with Mandatory fields
Scenario Outline:: Login into Leaftaps and create Lead (Positive)
    #Given Invoke Leaftap Application
    And Enter the UserName as <userName>
    And Enter the Password as <passWord>
    And Click on Login Button
    #Then Verify the Login is sucess
    And Click on crmsfa Link
    And Click on Leads Tab
    And Click on Create Lead
    And Enter the Company Name as TestLeaf
    And Enter the First Name as Senthilnathan
    And Enter the Last Name as Sengottuvelu
	And Click on CreateLead button
	#Then Verify the Lead Page
	
	Examples:
|userName|passWord|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|