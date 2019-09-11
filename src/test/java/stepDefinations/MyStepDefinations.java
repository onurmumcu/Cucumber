package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefinations {
	
	@Given("^User is on Greencart Landing page$")
	public void user_is_on_Greencart_Landing_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("^User searched for \"([^\"]*)\" Vegetable$")
	public void user_searched_for_Vegetable(String arg1) throws Throwable {
	
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {

	}

	
	
}
