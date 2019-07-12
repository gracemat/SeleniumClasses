package PageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
//Write Pre Conditions here in BasePAge
public class BasePageTest {
	WebDriver driver;
	
	@BeforeTest
	public void lauchWebAppln()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://access.trivago.com/oauth/en-US/login?step=register");
	} 
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
