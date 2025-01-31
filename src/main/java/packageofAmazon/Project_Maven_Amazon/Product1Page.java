package packageofAmazon.Project_Maven_Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Product1Page {
	WebDriver  driver;
	//step1
		@FindBy(id="wishListMainButton")
		WebElement productwislist;
		@FindBy(xpath="//span[.='Continue shopping'][1]")
		WebElement continueshopping;
		@FindBy(id="add-to-cart-button")
		WebElement addtocart;
		@FindBy(id="sw-gtc")
		WebElement gotocart;
		@FindBy(xpath="(//span[@class='a-icon a-icon-small-add'])")
		WebElement incrementicon;
		//@FindBy(xpath="(//select[.='Quantity:'])[2]")
		//WebElement quanitytydropdown;
		
		@FindBy(id="quantity")
		WebElement quanitytydropdown;
		
		
		
		//step2
		public void productwislistadd() throws InterruptedException 
		{productwislist.click();
		}
		
		public void continueshoppingclick() throws InterruptedException 
		{continueshopping.click();
		}
		
		public void productaddtocart() throws InterruptedException 
		
		{
			Thread.sleep(8000);
			
			addtocart.click();
		
		}
		
		public void openCart() throws InterruptedException 
		{gotocart.click();
		}
		
		public void increseQuantity() throws InterruptedException 
		{incrementicon.click();
	
		}
		public void increseQuantityDropdown(WebDriver driver) throws InterruptedException 
		
		{//Thread.sleep(2000);
			
	       
			Select s= new Select(quanitytydropdown);
			Thread.sleep(2000);
	         s.selectByIndex(1);
	        // quanitytydropdown.sendKeys(Keys.ARROW_DOWN.ENTER);
	       //System.out.println( s.getFirstSelectedOption());
	      
	         /*Actions a= new Actions(driver);
	         a.moveToElement(quanitytydropdown).doubleClick().perform();
	         Thread.sleep(2000);*/
	
		}
		//step3
		public Product1Page(WebDriver  driver) {
			PageFactory.initElements(driver, this);
		}
}
