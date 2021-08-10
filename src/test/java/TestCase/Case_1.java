package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Case_1 extends Base_class {
	@BeforeTest
	public void DBstart() {
		System.out.println("DB connected");
	}
	
	@AfterTest
	public void DBclose() {
		System.out.println("DB closed");
	}
	
	@Before
	public void browserlaunch() 
	{
		System.out.println("Launching browser");
	}
	 
	@AfterMethod
	public void browserclosing() 
	{
		System.out.println("closing browser");
		System.out.println(); 
	}
	
	@Test(priority=2)
	public void UserLogin()
	{
		System.out.println("Executing login");
	}
	
	@Test(priority=1)
	public void UserReg() 
	{
		System.out.println("Executing Registration");
	}
}
