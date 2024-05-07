package StepDefinations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;

import Pages.MyAccount;
import Pages.ProductDescription;
import Utilities.TestContext;
import Utilities.excelutils;
import io.cucumber.datatable.DataTable;
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

	@DataProvider(name = "testdata")
	@When("the user enter the email and password")
	public void the_user_enter_the_email_and_password(String email, String password) {

	}

	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {

	}

	@Then("user should click on signout.")
	public void user_should_click_on_signout() {

	}

	@When("^the user enters (.*) and (.*) in the login area$")
	public void whenTheUserEntersCredentialsInTheLoginArea(String username, String password) {
		MyAcc.MyAccountbutton();
		MyAcc.email(username);
		MyAcc.pass(password);

	}

	@Then("the user should be redirected to the login page")
	public void thenTheUserShouldBeRedirectedToTheLoginPage() {

	}
	
	/*
	 * how to use data provider in trms of selenium
	 */

	@DataProvider
	public Object[][] testdata() throws IOException {

		File a = new File("C:\\Users\\DELL\\Desktop\\users.xlsx");
		excelutils excel = new excelutils();
		int rows = excel.getrows(a) + 1;
		int cols = excel.getcols(a);
		Object[][] data = new Object[rows][cols];

		for (int i = 0; i <= rows - 1; i++) {

			for (int j = 0; j < cols; j++) {

				String re = excel.getdata(rows, cols, a);
				data[i][j] = re;

			}

		}

		return data;

	}

	@Given("the user is in the Landing Page")
	public void the_user_is_in_the_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		MyAcc.MyAccountbutton();

	}

	@When("^the user enter the username and password$")
	public void the_user_enter_the_username_and_password(DataTable dataTable) {
		List<List<String>> op = dataTable.cells();
		for (int i = 0; i <= op.size() - 1; i++) {

			for (int j = 0; j <= op.get(i).size() - 1; j++) {

				MyAcc.email(op.get(i).get(j));
				MyAcc.pass(op.get(i).get(j));

			}

		}
	}

}
