package TestCase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base_class {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Initialising everything");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Quiting everything");
	}

}
