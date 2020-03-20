package stepsdefintion;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void preCondition(Scenario sc) {
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());
		
	}
	
	@After
	public void postCondition(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());
	}

}
