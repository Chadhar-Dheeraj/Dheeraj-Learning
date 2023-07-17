
package TestScenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Objects.Facebookpage;

import Objects.GoogleSearchpage;
import Objects.Search;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethodPageFactory {
	WebDriver driver;
	GoogleSearchpage Objectrepo;
	Search pageFactory;
	Facebookpage Facebookpage;

	// GoogleSearchpage pagefactory;

	@BeforeTest
	public void beforetest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// to manage sign in to google //stop this as there need to be manage frame
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();

	}
	// POM method
//	@Test (priority = 0, enabled = false)
//	public void SearhOperation() throws InterruptedException {
//		GoogleSearchpage page = new GoogleSearchpage(driver);
//		
//		page.searchgoogle("facebook");
//	}

	// Page Factory method
	@Test(priority = 0, enabled = true)
	public void SearhOperation() throws InterruptedException {
//		GoogleSearchpage page = new GoogleSearchpage(driver);
		pageFactory = new Search(driver);
		pageFactory.searchgoogle("facebook");
	

	}

	@Test(priority = 1, enabled = true)
	public void VerifyaccessFacebook() throws InterruptedException {
		// Objectrepo = new GoogleSearchpage(driver);
		// Objectrepo.ClickFacebook();
		pageFactory = new Search(driver);
		Thread.sleep(2000);
		pageFactory.ClickFacebook();

	}

	@Test(priority = 2, enabled = true)
	public void VerifyLogin() throws InterruptedException {
		pageFactory = new Search(driver);
		Thread.sleep(4000);
		pageFactory.EnterUsername1();
		Thread.sleep(1000);
		pageFactory.EnterPassword1();
		Thread.sleep(1000);
		pageFactory.VerifyLogin1();

	}

	@AfterTest( enabled = true)
	public void aftertest() {
		driver.quit();
	}
}
