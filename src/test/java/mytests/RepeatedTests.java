package mytests;

import org.testng.annotations.Test;

public class RepeatedTests {
	
	//here it shows as 6 tests executed
	  @Test(invocationCount=6) public void createUserTest() {
	  System.out.println("Creating User .."); }
	 
	
	//Without Invocation count ,here Test will appear as one only with utility method
//	@Test
//	public void createUserUtilityTest()
//	{
//		for(int i=0;i<9;i++) {
//			createUserUtilityMethod();//u can call diff method without object bcos here it is non static method 
//			}
//		}
//	
//	public void createUserUtilityMethod()
//	{
//		System.out.println("Creating userId");
//	}
}
