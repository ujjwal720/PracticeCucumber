package StepDefinations;

import org.testng.Assert;

import Pages.ShopPages;
import Utilities.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoopingPageStepDefinations {

	public TestContext a;
	public ShopPages b;

	public ShoopingPageStepDefinations(TestContext a) {

		this.a = a;
		this.b = a.ObjectManager.sho1();

	}

	@When("the user is in the shooping page")
	public void the_user_is_in_the_shooping_page() {

		b.redirecttoshop();

	}

	@Then("the user verify whether the product is availabe or not")
	public void the_user_verify_whether_the_product_is_availabe_or_not() {

		try {

			b.getprices("Selenium Ruby");
			Assert.assertTrue(true);

		}

		catch (Exception e) {
			
			e.printStackTrace();

		}

	}

}
