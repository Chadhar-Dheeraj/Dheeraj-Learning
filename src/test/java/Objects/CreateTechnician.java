package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateTechnician {
	WebDriver driver;
	
	public CreateTechnician(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//SA Technician Tab field
	@FindBy (xpath = "(//a)[2]")
		public WebElement TechnicianFieldElement ;
	
	//Add Technician button
	@FindBy (xpath = "//button[@class='blue-btn']")
		public WebElement AddTechnician;

	//First Name field
	@FindBy (xpath = "//input[@name='firstName']")
	public WebElement FistName;

	//Last Name field
		@FindBy (xpath = "//input[@name='lastName']")
		public WebElement LastName;
		
		//emailAddress field
		@FindBy (xpath = "//input[@name='emailAddress']")
		public WebElement EmailAddress;
	
		//Cell Phone field
		@FindBy (xpath = "//input[@placeholder='Cell Phone']")
		public WebElement CellPhone;
		
		//State field
		@FindBy(xpath = "//Select[@name='state']")
			public WebElement State;
		
		
		//Zip field
		@FindBy (xpath = "//input[@name='zip']")
		public WebElement Zip;
		
		//Create button

		@FindBy (xpath = "//button[@type='submit']")		
			public WebElement CreateButton;
		
		@FindBy (xpath = "//div[@role='alert']")
			public WebElement ValidationToast;
		
		
		//Navigation Element 
		
		@FindBy (xpath = "//textarea[@name='q']" )
			public WebElement GoogleSearch;
		
		@FindBy (xpath = "(//input[@value='Google Search'])[1]" )
		public WebElement SearchButton;
		
		@FindBy (xpath = "(//h3)[5]")
			public WebElement Facebooklink;
		
		
		
		
		
		
		public void AddTechnicianbtn() {
			AddTechnician.click();
		}

		public void TechnicianField() {
			// TODO Auto-generated method stub
			TechnicianFieldElement.click();
		}

		public void firstName() {
			FistName.sendKeys("dheeraj");
		}
		
		public void lastName() {
			LastName.sendKeys("Chadhar");
		}
		
		public void emailAddress() {
			EmailAddress.sendKeys("dheeraj.chadhar+66@sculptosft.com");
		}
		
		public void cellPhone() {
			CellPhone.sendKeys("13333333333");
		}
		
		public void zip() {
		Zip.sendKeys("20601");
		}
		
		public void createButton() {
			CreateButton.click();
		}
		
		public String getValidationtext() {
			return ValidationToast.getText();
			
		}
		
		public void SelectState() throws InterruptedException {
			Select select = new Select(State);
			Thread.sleep(2000);
			select.selectByValue("Texas");
			Thread.sleep(2000);
			select.selectByVisibleText("Texas");
			Thread.sleep(2000);
			select.selectByIndex(5);
		}
		
		//Methods for navigation
		public void searchGoogle() {
			GoogleSearch.sendKeys("facebook");
		}
		
		public void searchButton() {
			SearchButton.click();
			
		}
		
		public void facebookLink() throws InterruptedException {
			Thread.sleep(5000);
			Facebooklink.click();
		}
	}


