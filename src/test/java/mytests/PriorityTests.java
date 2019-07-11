package mytests;

import org.testng.annotations.Test;

public class PriorityTests {
	@Test(priority=0)
	public void loginTestFirst()
	{
		System.out.println("Testing11111");
	}
	@Test(priority=0)
	public void secondTest()
	{
		System.out.println("Second Test");
	}
	@Test(priority=0)
	public void secondRoundTest()
	{
		System.out.println("Checking alphabet Priority");
	}
	@Test
	public void defaultTest()
	{
		System.out.println("Default priority is given highest preference");
	}

}
