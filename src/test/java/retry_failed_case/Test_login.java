package retry_failed_case;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_login {

	@Test
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	static int count=0;
	@Test
	public void addProduct() {
		count++;
		System.out.println("retry :"+count);
		Assert.fail("Executing failed test");
	}
	
}
