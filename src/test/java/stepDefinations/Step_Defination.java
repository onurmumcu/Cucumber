package stepDefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination {
	
	@Given("^validate teh browser$")
    public void validate_teh_browser() throws Throwable {
       System.out.println("deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
      System.out.println("Browser is rtriggered");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Browser is triggered");
    }


	@Given("^User is landing page$")
	public void user_is_landing_page() throws Throwable {
		System.out.println("Navigated to login url");
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
	 @When("^User login in to application with (.+) and (.+)$")
	public void user_login_in_to_application_with_user_and_Pass(String username, String password) throws Throwable {
		 System.out.println(username);
		   System.out.println(password);
	}


	
	
}
