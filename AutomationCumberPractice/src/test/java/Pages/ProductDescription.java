package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.TestContext;

public class ProductDescription {

	public TestContext context;
	public WebDriver driversp;

	public ProductDescription(WebDriver driver) {

		this.driversp = driver;
	}

	@FindBy(xpath = "//li[@class='description_tab active']/a")
	WebElement discription;

	@FindBy(xpath = "//div[@id='tab-description']")
	WebElement product_discrip;

	@FindBy(xpath = "//li[@class='reviews_tab active']/a")
	WebElement reveiws;

	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement comment;

	public void discription() {

		discription.click();

	}

	public boolean discriptiondisplayedcheck() {

		return product_discrip.isDisplayed();

	}

	public void msm() {

		reveiws.click();

	}

	public boolean mesme() {
		
		return comment.isDisplayed();

	}

}
