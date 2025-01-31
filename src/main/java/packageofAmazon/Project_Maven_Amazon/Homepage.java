package packageofAmazon.Project_Maven_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver  driver;
//step1
	@FindBy(id="twotabsearchtextbox")
	WebElement serachif;
	@FindBy(xpath="(//span[@class='nav-line-2 '])[1]")
	WebElement Searchhoverover;
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin;
	//step2
	public void searching() {
		serachif.sendKeys("shoe"+ Keys.ENTER);
	}
	
	public void hovering(WebDriver  driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(Searchhoverover).perform();
	}
	public void signin() throws InterruptedException {
		signin.click();
		Thread.sleep(2000);
	}
	//step3
	public Homepage(WebDriver  driver) {
		PageFactory.initElements(driver, this);
	}
}
