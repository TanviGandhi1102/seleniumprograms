package packageofAmazon.Project_Maven_Amazon;

import org.testng.annotations.Test;

//login->searching->wishlist->cart->logout
public class TestCase2 extends LaunchQuit
{
	@Test
	public void login_searching_wishlist_cart_logout() throws InterruptedException
	{
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
			product1page.productaddtocart();
			Thread.sleep(2000);
			lp.Signouthovering(driver);
			lp.signoutbuttonclick();
	}
}
