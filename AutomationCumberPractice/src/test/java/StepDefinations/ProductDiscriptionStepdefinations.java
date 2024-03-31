package StepDefinations;

import org.testng.Assert;

import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDiscriptionStepdefinations {

	public TestContext contextu;
	public Pages.ProductDescription ProductDescription;

	public ProductDiscriptionStepdefinations(TestContext a) {

		this.contextu = a;

		ProductDescription = a.ObjectManager.productdis();

	}

	@Given("the user clicks on one of the products")
	public void the_user_clicks_on_one_of_the_products() {
		// Write code here that turns the phrase above into concrete actions
		ProductDescription.seleniumruby();
		contextu.gebericfunctions.webelementwaitss(ProductDescription.discription);
		ProductDescription.discription();
		

	}

	@When("the user is redirected to the product description page")
	public void the_user_is_redirected_to_the_product_description_page() {
		
		boolean xc=ProductDescription.discriptiondisplayedcheck();
		Assert.assertTrue(xc);
		System.out.println("it is passed");

	}
    
	

	@Then("the product description should be displayed")
	public void the_product_description_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		ProductDescription.msm();
		boolean t=ProductDescription.mesme();
		Assert.assertTrue(t);
		

	}
	
	
	

}
