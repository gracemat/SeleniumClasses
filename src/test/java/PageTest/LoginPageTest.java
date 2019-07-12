package PageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	WebDriver driver;
	
	@BeforeTest
	public void lauchWebAppln()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://access.trivago.com/oauth/en-US/login?step=register");
	} 
	
	@Test
	public void loginPageTitleTest()
	{
		String loginTitle = driver.getTitle();
		System.out.println("Home Page Title is :: " +loginTitle);
		Assert.assertEquals(loginTitle, "Log in or create your account - trivago");
//		if(loginTitle.equals("Log in or create your account - "))//when the test failed Testng doesnot show red here if we use if else methods
//		{
//			System.out.println("Test Passed");
//		}else 
//		{
//			System.out.println("FAIL");
//		}
	}
	
	@Test
	public void registerButtonTest()
	{
		boolean regFlag = driver.findElement(By.id("register_email_submit")).isDisplayed();
		Assert.assertTrue(regFlag);
		System.out.println(regFlag);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

}
