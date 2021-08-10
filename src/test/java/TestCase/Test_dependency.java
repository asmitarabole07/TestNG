package TestCase;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test_dependency extends Base_class {

	@Test
	public void name1() {
		System.out.println("name1");
		Assert.fail("name-1 fail");
	}
	
	@Test(dependsOnMethods = {"name1","name3"})
	public void name2() {
		System.out.println("name2");
	}
	
	@Test
	public void name3() {  
		System.out.println("name3");
		//Assert.fail();
	}
	
	@Test(groups = "smoke")
	public void name4() {
		System.out.println("name4");
	}
	
	@Test(groups = "smoke")  
	public void name5() {
		System.out.println("name5");
		throw new SkipException("Forcefully skipping test : name5()");//to forcefully skip test
	}
}
