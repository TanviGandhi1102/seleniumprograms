package packageofAmazon.Project_Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver  driver;
	//step1
		@FindBy(id="ap_email_login")
		WebElement username;
		@FindBy(id="continue")
		WebElement continuebutton;
		@FindBy(id="ap_password")
		WebElement apppassword;
		@FindBy(id="auth-signin-button")
		WebElement Signinbutton;
		@FindBy(xpath="(//span[@class='nav-line-2 '])")
		WebElement signouthover;
		@FindBy(xpath="(//span[.='Sign Out'])[1]")
		WebElement signoutbutton;
		//step2
		public void un() throws InterruptedException {
		username.sendKeys("ssoguser1234@gmail.com");
		
			Thread.sleep(5000);			
		}
		
		public void continuebuttonclick() {
			continuebutton.click();;
		}
		public void passwd() throws InterruptedException  {
			Thread.sleep(3000);	
			apppassword.sendKeys("Sso@1234");
			
		}
		public void signinbuttonclick() {
			Signinbutton.click();;
		}
		public void Signouthovering(WebDriver  driver) {
			Actions a1=new Actions(driver);
			a1.moveToElement(signouthover).perform();
		}
		public void signoutbuttonclick() {
			signoutbutton.click();;
		}
		//step3
		public LoginPage(WebDriver  driver) {
			PageFactory.initElements(driver, this);
		}
}
