package TestScenarios;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.RemoteVal_SA_Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSA_RemoteValLogin {
	WebDriver driver;
	RemoteVal_SA_Login Objectrepo;

	@BeforeTest
	public void beforetest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://dev-superadmin.remoteval.net/sign-in");
		driver.manage().window().maximize();
		
	}
	
	//Verify SA Login 
	@Test
	public void VerifySALogin () throws InterruptedException {
		Objectrepo = new RemoteVal_SA_Login(driver);
		Thread.sleep(2000);
		Objectrepo.EnterEmail();
		Thread.sleep(2000);
		Objectrepo.EnterPassword();
		Thread.sleep(2000);
		Objectrepo.LoginButton();
		
		Thread.sleep(3000);
		String title = driver.getTitle();
		assertEquals(title, "Profile - Admin RemoteVal");
	}
	
	

}
