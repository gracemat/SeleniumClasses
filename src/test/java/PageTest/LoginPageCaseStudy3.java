package PageTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
//Use This CaseSTudy for only tests running 
public class LoginPageCaseStudy3  extends BasePageTest{
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

}
