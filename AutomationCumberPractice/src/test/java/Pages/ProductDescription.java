package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestContext;

public class ProductDescription {

	public TestContext context;
	public WebDriver driversp;

	public ProductDescription(WebDriver driver) {

		this.driversp = driver;
		PageFactory.initElements(driversp, this);
	}

	@FindBy(xpath = "//img[@alt='Selenium Ruby']")
	public WebElement seleniumruby;

	@FindBy(xpath = "//li[@class='description_tab active']/a")
	public WebElement discription;

	@FindBy(xpath = "//div[@id='tab-description']")
	public WebElement product_discrip;

	@FindBy(xpath = "//a[normalize-space()='Reviews (0)']")
	public WebElement reveiws;

	@FindBy(xpath = "//textarea[@id='comment']")
	public WebElement comment;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement addtobasket;

	public void seleniumruby() {

		seleniumruby.click();

	}

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

	public void addtobasket() {
		
		addtobasket.click();

	}

}
