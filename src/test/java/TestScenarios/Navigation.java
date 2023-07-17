package TestScenarios;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.CreateTechnician;
import Objects.RemoteVal_SA_Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {
	public class TestSA_RemoteValLogin {
		WebDriver driver;
		CreateTechnician CreateTechnician;
		// Objectrepo;

		@BeforeTest()
		public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			
		}
		
		@Test (priority = 1)
		public void NavigateToFacebook () throws InterruptedException {
			CreateTechnician = new CreateTechnician(driver);
			Thread.sleep(5000);
//			CreateTechnician.searchGoogle();
//			Thread.sleep(3000);
//			CreateTechnician.searchButton();
//			Thread.sleep(2000);
//			CreateTechnician.facebookLink();

			driver.navigate().to("https://www.facebook.com/");
		}
		
		@Test (priority = 2)
		public void NavigateBack() throws InterruptedException {
			Thread.sleep(10000);
			driver.navigate().back();
		}
		
		@Test (priority = 3)
		public void NavigateForword() throws InterruptedException {
			Thread.sleep(5000);
			driver.navigate().forward();
			
			Thread.sleep(10000);
			
			driver.close();
		}
	}

}
