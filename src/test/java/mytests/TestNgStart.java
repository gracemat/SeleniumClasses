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
	//S T C M----M C T S is the sequence of execution
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
	@Test
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	@Test
	public void secondRoundTest()
	{
		System.out.println("Checking alphabet Priority");
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
//[RemoteTestNG] detected TestNG version 6.14.3
//Opening Browser
//Launching Url
//Login to App
//Log in Test
//Testing11111
//Logout
//Log in Test
//Second Test
//Logout
//User got deleted
//Database Disconnecting
//PASSED: loginTestFirst
//PASSED: secondTest
//
//===============================================
//    Default test
//    Tests run: 2, Failures: 0, Skips: 0
//===============================================
//
//Closing Browser
//
//===============================================
//Default suite
//Total tests run: 2, Failures: 0, Skips: 0
//===============================================


