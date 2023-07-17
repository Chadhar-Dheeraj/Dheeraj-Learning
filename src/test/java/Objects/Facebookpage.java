package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.*;


public class Facebookpage {
	WebDriver driver;

	public Facebookpage(WebDriver driver) {
		this.driver = driver;
		
	}


//Page object model elements
	By Username_editbox = By.xpath("//input[@name='email']");
	By Password_editbox = By.xpath("//input[@name='pass']");
	By Login_Btn = By.name("login");
   
	//POM method 1
	public void EnterUsername() {
		driver.findElement(Username_editbox).clear();
		driver.findElement(Username_editbox).sendKeys("7899229923");
		
	}
	
	
	
	// /POM method 2
	public void EnterPassword() {
		driver.findElement(Password_editbox).clear();
		driver.findElement(Password_editbox).sendKeys("Dheeraj@Chadhar");;
		
	}
	
	
	
	///POM method 3
	public void VerifyLogin( ) throws InterruptedException {
		driver.findElement(Login_Btn).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	assertEquals(title,"Facebook");
}
	
	
}

