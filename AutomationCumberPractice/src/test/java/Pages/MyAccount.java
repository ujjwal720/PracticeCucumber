package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	public WebDriver driver;

	public MyAccount(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@id='main-nav']/li[2]/a")
	public WebElement myAccounts;

	@FindBy(xpath = "(//input[@type='email'])[1]")
	public WebElement email;

	@FindBy(xpath = "//input[@id='reg_password']")
	public WebElement password;

	@FindBy(xpath = "//input[@name='register']")
	public WebElement register;

	public void MyAccountbutton() {

		myAccounts.click();

	}

	public void email(String s) {

		email.sendKeys(s);

	}

	public void pass(String s) {

		password.sendKeys(s);
	}

	public void register() {

		register.click();
	}
	


}
