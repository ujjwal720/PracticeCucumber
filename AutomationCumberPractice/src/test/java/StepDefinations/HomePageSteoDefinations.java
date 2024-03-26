package StepDefinations;

import org.testng.Assert;

import Pages.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteoDefinations {

	public TestContext a;

	public HomePageSteoDefinations(TestContext a) {

		this.a = a;

	}

	@Given("the user is redirected to Homepage")
	public void the_user_is_redirected_to_homepage() {

		System.out.println("Url is opened now");

	}

	@When("on the fotter it should have three arivals only.")
	public void on_the_fotter_it_should_have_three_arivals_only() {

		try {
			HomePage d = a.ObjectManager.home();
			int x = d.slidersvalue();
			Assert.assertEquals(3, x);

		}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}
	
	
	@When("the user click on all {int} sliders it should navigate")
	public void the_user_click_on_all_sliders_it_should_navigate(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
