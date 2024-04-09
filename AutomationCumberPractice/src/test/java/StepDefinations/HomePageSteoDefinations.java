package StepDefinations;

import org.testng.Assert;

import Pages.HomePage;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteoDefinations {

	public TestContext a;
	public HomePage d;

	public HomePageSteoDefinations(TestContext a) {

		this.a = a;
		 d = a.ObjectManager.home();

	}

	@Given("the user is redirected to Homepage")
	public void the_user_is_redirected_to_homepage() {

		System.out.println("Url is opened now");

	}

	@When("on the fotter it should have three arivals only.")
	public void on_the_fotter_it_should_have_three_arivals_only() {

		try {

			int x = d.slidersvalue();
			Assert.assertEquals(3, x);

		}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	
	
	@Given("the user is on landing page")
	public void the_user_is_on_landing_page() {
	    
		System.out.println("The 2nd test is now running at this time");
	    
	}
	@When("check the redirection of the sliders each with build")
	public void check_the_redirection_of_the_sliders_each_with_build() {
	    // Write code here that turns the phrase above into concrete actions
		try {

			for (int i = 0; i <= d.laxyloading.size()-1; i++) {
			   
				
				d.laxyloading.get(i).click();
				a.drivers.navigate().back();
				
				a.gebericfunctions.webelementwaitss(d.laxyloading.get(i));
				

			}
			
			Assert.assertEquals("tom", "tommy");

		}

		catch (Exception e) {
			
			System.out.println(e);

		}
	}

}
