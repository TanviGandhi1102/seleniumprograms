package packageofAmazon.Project_Maven_Amazon;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class TestCase1 extends LaunchQuit
{
	@Test
	public void logintoamazon_search_logout() throws InterruptedException
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
		lp.Signouthovering(driver);
		lp.signoutbuttonclick();
		
		
		
	}
}
