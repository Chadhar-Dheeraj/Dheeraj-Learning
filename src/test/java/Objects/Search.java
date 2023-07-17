package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

	WebDriver driver;

	public Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Goole search and facebook search/click
	@FindBy(xpath = "//*[@name='q']")
	public WebElement Searchbox;
	@FindBy(xpath = "(//*[@name='btnK'])[1]")
	public WebElement Search_btn;
	@FindBy(xpath = "(//div/cite)[1]")
	public WebElement Facebook_link;

	// Page Factory facebook element
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailfield;
	@FindBy(xpath = "//input[@name='pass']")
	WebElement passfield;
	@FindBy(xpath = "//button[@name='login']")
	WebElement loginbutton;

	public void searchgoogle(String Searchinput) throws InterruptedException {

		try {
			Searchbox.sendKeys(Searchinput);
			Thread.sleep(2000);
			Search_btn.click();
		} catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
	}

	public void ClickFacebook() {
		try {
			Facebook_link.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception caught " + e.getMessage());
		}
	}

	// Page Factory method 1
	public void EnterUsername1() {

		emailfield.sendKeys("7828493055");
	}

	// Page Factory method 2
	public void EnterPassword1() {

		passfield.sendKeys("7828493055");
	}

	// Page Factory method 3
	public void VerifyLogin1() throws InterruptedException {
		loginbutton.click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if (title == "Facebook" || title == "Log in to Facebook") {
			System.out.println("Test is Pass");
		} else if (title == "Log in to Facebook") {
			System.out.println("Test is Pass");
		} else {
			System.out.println("Test Failed" + title);
		}
	}
}
