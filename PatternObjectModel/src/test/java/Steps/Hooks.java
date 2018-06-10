package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {

	@Before
	public void beforeScenario(Scenario sc) {
		startResult();
		startTestModule(sc.getName(),sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("senthil");
		startApp("chrome");	
//		System.out.println(sc.getName());
//		System.out.println(sc.getId());

	}

	@After
	public void afterScenario(Scenario sc) {
		closeAllBrowsers();
		endResult();
//		System.out.println(sc.getStatus());
//		System.out.println(sc.isFailed());

	}
	
}
