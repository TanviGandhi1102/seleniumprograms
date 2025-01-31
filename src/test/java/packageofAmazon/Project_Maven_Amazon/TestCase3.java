package packageofAmazon.Project_Maven_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//login->searching->wishlist->cart->increase the product quantity by 3-->logout
public class TestCase3 extends LaunchQuit{
@Test
public void login_searching_wishlist_cart_increment_logout() throws InterruptedException{
	Homepage hm= new Homepage(driver);
	hm.hovering(driver);
	hm.signin();
	LoginPage lp= new LoginPage(driver);
	
	lp.un();
	lp.continuebuttonclick();
	lp.passwd();
	lp.signinbuttonclick();
		hm.searching();
		
		SearchResultPage searchpage=new SearchResultPage(driver);
		searchpage.productSelection(driver);
	
		Product1Page product1page= new Product1Page(driver);
		product1page.productwislistadd();
		product1page.continueshoppingclick();
		Thread.sleep(3000);
		product1page.increseQuantityDropdown(driver);
		
		Thread.sleep(5000);
		product1page.productaddtocart();
		Thread.sleep(2000);
		product1page.openCart();
		//product1page.increseQuantity();
		
}
}
