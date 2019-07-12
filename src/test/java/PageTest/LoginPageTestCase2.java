package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//CASE STUDY 2
//Here Browser launches everytime as we used BeforeMethod AfterMethod Annotations
//Prefer this case eventhough it takes little more time to launch everytime

public class LoginPageTestCase2 {
	public class LoginPageTest {
		WebDriver driver;
		@BeforeMethod
		public void lauchWebAppln()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://access.trivago.com/oauth/en-US/login?step=register");
			driver.getCurrentUrl();//this is not printing after launching
		} 
		
		@Test(priority=1)
		public void loginPageTitleTest()
		{
			String loginTitle = driver.getTitle();
			System.out.println("Home Page Title is :: " +loginTitle);
			Assert.assertEquals(loginTitle, "Log in or create your account - trivago");

		}		
		@Test(priority=2)
		public void registerButtonTest()
		{
			boolean regFlag = driver.findElement(By.id("register_email_submit")).isDisplayed();
			Assert.assertTrue(regFlag);
			System.out.println(regFlag);
		}
				@AfterMethod
		public void tearDown()
		{
			System.out.println("Closing all open Windows");
			driver.quit();
		}
		
	}

}
