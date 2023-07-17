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

public class TestMethods_GoogleSearch_POM {
	WebDriver driver;
	GoogleSearchpage Objectrepo;
	Search pageFactory;
	
	
	//GoogleSearchpage pagefactory;
	
	@BeforeTest
	public void beforetest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		//to manage sign in to google //stop this as there need to be manage frame
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		
	}
 //POM method
	@Test (priority = 0, enabled = true)
	public void SearhOperation() throws InterruptedException {
		GoogleSearchpage page = new GoogleSearchpage(driver);
		
		page.searchgoogle("facebook");
	}
	
	
	@Test (priority = 1, enabled = true)
	public void VerifyaccessFacebook() {
		Objectrepo = new GoogleSearchpage(driver);
		Objectrepo.ClickFacebook();
	}
	
	@Test (priority = 2, enabled = true)
	public void VerifyLogin() throws InterruptedException {
		Facebookpage page = new Facebookpage(driver);
		Thread.sleep(4000);
		page.EnterUsername();
		Thread.sleep(1000);
		page.EnterPassword();
		Thread.sleep(1000);	
		page.VerifyLogin();
		
	}
	
	@AfterTest(enabled = true)
	public void aftertest() {
		driver.quit();
	}
}
