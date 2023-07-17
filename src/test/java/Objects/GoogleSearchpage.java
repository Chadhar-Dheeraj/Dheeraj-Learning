package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchpage {
	
	WebDriver driver; 
	
	public GoogleSearchpage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Google searchPage locators
	By searchbox = By.xpath("//*[@name='q']");
	By Searchbtn = By.xpath("(//*[@name='btnK'])[1]");
	By facebooklink = By.xpath("(//div/cite)[1]");
	
	
	//Facebook login locators
//	By email = By.xpath("//*[@id=\"email\"]");
//	By password = By.xpath("//*[@id=\"pass\"]");
//	By login_button = By.xpath("//button[@name='login']");
	
	
	
	public void searchgoogle(String Searchinput) throws InterruptedException {
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(3000);
			driver.findElement(Searchbtn).click();
		} catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
		
		
		
		//driver.findElement(password).sendKeys("@Xyx12344");
		Thread.sleep(3000);
		//driver.findElement(login_button).click();
	}

	public void ClickFacebook () {
		try {
			driver.findElement(facebooklink).click();
			
	Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Exception caught " + e.getMessage());
		}
	}
	}

