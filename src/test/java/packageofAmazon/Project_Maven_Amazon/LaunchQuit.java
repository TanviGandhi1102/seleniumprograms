package packageofAmazon.Project_Maven_Amazon;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit 
{
	//EdgeDriver driver;
	ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
		 driver=new ChromeDriver();
		 /*ChromeOptions options = new ChromeOptions();
		 options.addArguments("--incognito");		
		 ChromeDriver driver = new ChromeDriver(options);*/
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
