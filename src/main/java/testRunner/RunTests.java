package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


public class RunTests {
	
	        @CucumberOptions(features="src/test/java/features/AutomationPratice.feature",
			glue="stepsdefintion",
			monochrome=true
			)
	public class RunTest extends AbstractTestNGCucumberTests{

}
}
