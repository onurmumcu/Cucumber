package stepDefinations;

import Automation.Cucumber.Base;
import cucumber.api.java.After;

public class Hooks extends Base{
	
	@After("@SeleniumTest")
	public void afterSeleniumTest() {
		driver.close();
	}

}
