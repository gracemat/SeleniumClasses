package mytests;

import org.testng.annotations.Test;

public class DependsonMethod {
	//if the login is not successful there is no need to run all 1000's of test cases so use dependsOnMethods 
	
	@Test
	public void loginTest()
	{
		System.out.println("Loggging into App");
		int i = 11/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePage()
	{
		System.out.println("Home Page Testing");
	}

}
