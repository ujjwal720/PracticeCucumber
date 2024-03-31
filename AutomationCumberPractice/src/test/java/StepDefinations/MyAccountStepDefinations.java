package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import Pages.MyAccount;
import Pages.ProductDescription;
import Utilities.TestContext;
import Utilities.excelutils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDefinations {

	public TestContext TestContext;
	public MyAccount MyAcc;

	public MyAccountStepDefinations(TestContext a) {

		this.TestContext = a;
		MyAcc = TestContext.ObjectManager.product1();
	}

	@Given("the user is in Acccount Page")
	public void the_user_is_in_acccount_page() {

		MyAcc.MyAccountbutton();

	}

	
	@DataProvider(name="testdata")
	@When("the user enter the email and password")
	public void the_user_enter_the_email_and_password(String email,String password) {

	}

	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {

	}

	@Then("user should click on signout.")
	public void user_should_click_on_signout() {

	}

	@DataProvider
	public Object[][] testdata() throws IOException {

		File a = new File("C:\\Users\\DELL\\Desktop\\users.xlsx");
		excelutils excel = new excelutils();
		int rows = excel.getrows(a) + 1;
		int cols = excel.getcols(a);
		Object[][] data = new Object[rows][cols];

		for (int i = 0; i <= rows - 1; i++) {

			for (int j = 0; j < cols; j++) {

			String re=excel.getdata(rows, cols, a);
			data[i][j]=re;

			}

		}
		
		return data;

	}
	
	

}
