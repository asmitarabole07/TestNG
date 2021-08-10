package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Case_2 extends Base_class {

	
	@Test
	public void string() {
		
		SoftAssert softAssert=new SoftAssert();
		
		
		String actual="Asmit";
		String expected="Amit";
		
		softAssert.assertEquals(actual, expected);
		System.out.println("String error");
		//Assert.fail("Errorrrrrrrrr");
	
		int a=10;
		int b=20;
		softAssert.assertEquals(a, b);
		System.out.println("int error");
		
		softAssert.assertAll();
	}
}
