package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//ul[@class='products']/li")
	public List<WebElement> newarrivals;

	@FindBy(xpath = "//img[@loading='lazy']")
	public List<WebElement> laxyloading;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public int slidersvalue() {

		int arrivals = newarrivals.size();

		return arrivals;

	}

	

	}


