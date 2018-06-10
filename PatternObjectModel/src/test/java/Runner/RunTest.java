package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "C:\\Testleaf_training\\PatternObjectModel\\PatternObjectModel\\src\\test\\java\\features\\Login1.feature",
					 glue = {"Steps","pages"},
					 monochrome = true/*,
					 tags = {"@smoke and @sanity"}*/)
@RunWith(Cucumber.class)

public class RunTest {
	
	}


