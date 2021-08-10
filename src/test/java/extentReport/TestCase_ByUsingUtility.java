package extentReport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase_ByUsingUtility {

	@Test
	public void doLogin() {
		System.out.println("Executing Login Test");

	}

	@Test
	public void doBuy() {
		 Assert.fail("Buy Product Test Failed");

	}

	@Test
	public void doPayment() {
		 throw new SkipException("Skipping test case");
	}
}
