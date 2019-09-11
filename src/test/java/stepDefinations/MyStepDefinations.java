package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Automation.Cucumber.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepDefinations {
	
	public WebDriver driver;
	
	@Given("^User is on Greencart Landing page$")
	public void user_is_on_Greencart_Landing_page() throws Throwable {
		driver = Base.getDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}

	@When("^User searched for \"([^\"]*)\" Vegetable$")
	public void user_searched_for_Vegetable(String arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(arg1);
		Thread.sleep(3000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {

	Boolean sonuc = driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1);
	Assert.assertTrue(sonuc);
	}
	
	 @Then("^verify selected \"([^\"]*)\" items are displayed in Check out page$")
	    public void verify_selected_something_items_are_displayed_in_check_out_page(String arg1) throws Throwable {
		 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(arg1));
	    }

	    @And("^Added items to cart$")
	    public void added_items_to_cart() throws Throwable {
	        driver.findElement(By.cssSelector("a.increment")).click();
	        driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]")).click();
	    }

	    @And("^User procedeed to Checkout page for purchase$")
	    public void user_procedeed_to_checkout_page_for_purchase() throws Throwable {
	    	driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
	    	 driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    	  
	    }

	
	
}
