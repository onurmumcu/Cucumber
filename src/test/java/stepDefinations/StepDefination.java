package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

	

	

	    @Given("^User is landing page$")
	    public void user_is_landing_page() throws Throwable {
	     System.out.println("Navigated to login url");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	       System.out.println("Logged in successfully");
	    }
	    
	    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
	        System.out.println(arg1);
	        System.out.println(arg2);
	    }
	    
	    
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	       System.out.println("Validated home page");
	    }

	    @Then("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are(String arg1) throws Throwable {
	        System.out.println(arg1);
	    }

	}

