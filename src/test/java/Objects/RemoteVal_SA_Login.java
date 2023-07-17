package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoteVal_SA_Login {
	WebDriver driver;

	public RemoteVal_SA_Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//RemoteVal_SA_Login Elements
	
	//Login page email field
	@FindBy(xpath = "//input[@name='email']")
	public WebElement EmailField;
	
	//Login page password field
	@FindBy(xpath = "//input[@name='password']")
	public WebElement PasswordField;
	
	//Login page login button
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement LoginButton;
	
	
	//Method 1
	public void EnterEmail() {
		EmailField.sendKeys("sremoteval@gmail.com");
	}
	
	//Method 2
	public void EnterPassword() {
		PasswordField.sendKeys("Super@123");
	}
	
	//Method 3 
	public void LoginButton() {
		LoginButton.click();
	}
}
