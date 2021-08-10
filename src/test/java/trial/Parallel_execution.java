package trial;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_execution {

	@Parameters({"browser"})
	@Test
	public void test(String browser) throws InterruptedException {
		System.out.println(browser);
		Thread.sleep(2000);
	}
}
