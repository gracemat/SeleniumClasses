package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgStart {
	//pre-conditions:-
	//launch the browser 
	//launch the url
	//login to app
	//Test1 Test2 Test3 Validations
	//Post conditions
	//logout
	//browser closed
	//S T C M----M C T S
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Opening Browser");
	}
	@BeforeTest
	public void launchUrl()
	{
		System.out.println("Launching Url");
	}
	@BeforeClass
	public void loginToApp()
			{
		System.out.println("Login to App");
			}
	@BeforeMethod
	public void loginTest()
	{
		System.out.println("Log in Test");
	}
	@Test
	public void loginTestFirst()
	{
		System.out.println("Testing11111");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout");
	}
	@AfterTest
	public void disconnectDB()
	{
		System.out.println("Database Disconnecting");
	
	}
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Closing Browser");
		
	}
@AfterClass
public void deleterUser()
{
	System.out.println("User got deleted");
}
}
