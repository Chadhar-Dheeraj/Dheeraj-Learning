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

public class CreateTechnician_Method {
	public class TestSA_RemoteValLogin {
		WebDriver driver;
		CreateTechnician CreateTechnician;
		RemoteVal_SA_Login Objectrepo;

		@BeforeTest ()
		public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			driver.get("https://dev-superadmin.remoteval.net/sign-in");
			driver.manage().window().maximize();

			// SA Login
			Objectrepo = new RemoteVal_SA_Login(driver);
			Thread.sleep(2000);
			Objectrepo.EnterEmail();
			Thread.sleep(2000);
			Objectrepo.EnterPassword();
			Thread.sleep(2000);
			Objectrepo.LoginButton();

			Thread.sleep(3000);
			String title = driver.getTitle();
			assertEquals(title, "Profile - Admin RemoteVal","Test is pass");

		}

		@Test(priority = 1, enabled = false)
		public void CreateTechnician() throws InterruptedException {
			Thread.sleep(2000);
			CreateTechnician = new CreateTechnician(driver);
			// Click on technician field
			CreateTechnician.TechnicianField();

			// CLick on add technician
			CreateTechnician.AddTechnicianbtn();

		}
		
		
		@Test (priority = 2)
		public void EnterDetails() throws InterruptedException{
			CreateTechnician = new CreateTechnician(driver);
			Thread.sleep(2000);
			CreateTechnician.firstName();
			Thread.sleep(2000);
			CreateTechnician.lastName();
			Thread.sleep(2000);
			CreateTechnician.emailAddress();
			Thread.sleep(2000);
			CreateTechnician.cellPhone();
			Thread.sleep(2000);
			CreateTechnician.SelectState();
			Thread.sleep(2000);
			CreateTechnician.zip();
		}
		
		
		@Test (priority = 3)
		public void Create() throws InterruptedException {
			CreateTechnician = new CreateTechnician(driver);
			Thread.sleep(2000);
			CreateTechnician.createButton();
			String validation = CreateTechnician.getValidationtext();
			System.out.println(validation);
		}
	}

}
