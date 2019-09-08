package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations")
public class StepDefination {


	@Given("^User is landing page$")
	public void user_is_landing_page() throws Throwable {
		System.out.println("Navigated to login url");
	}
	
	@Given("^User is landing page iki$")
	public void user_is_landing_page_iki() throws Throwable {
		System.out.println("Navigated to login url 22222");
	}
	
	@Given("^User is landing page uc$")
	public void user_is_landing_page_uc() throws Throwable {
		System.out.println("Navigated to login url 33333");
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

	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable arg1) throws Throwable {

		List<List<String>> obj = arg1.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}


}
