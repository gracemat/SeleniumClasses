package mytests;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	@Test(expectedExceptions=ArithmeticException.class)
	public void exceptionTest()
	{
		System.out.println("Loggging into App");
		int i = 11/0;
	}
	@Test(expectedExceptionsMessageRegExp="/ by zero")
	public void loginTest()
	{
		System.out.println("Loggging into App");
		int i = 11/0;
	}
	

}
