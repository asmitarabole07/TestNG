package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tests_OHRM {
	
	Functions functions=new Functions();
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		functions.beforeSuit();
	}
	
	
	@BeforeClass
	public void Login() {
		functions.beforeClass();
	}
	
	@Test(priority = 1)
	public void SelectFunctionality() {
		functions.test_1_select();
	}
	
	@Test(priority = 2)
	public void passwordReset() {
		functions.test_2_passwordReset();
	}
	
	@AfterSuite
	public void tearDown() {
		functions.afterSuit();
	}

}
