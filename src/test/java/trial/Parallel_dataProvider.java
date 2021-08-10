package trial;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parallel_dataProvider {
	
	@Test(dataProvider = "getdata")
	public void test(String name) throws InterruptedException {
		Date date=new Date();
		System.out.println(name+"--"+date);
		Thread.sleep(2000);
	}

	@DataProvider(parallel = true)
	public Object[][] getdata() {
		
		Object[][]data=new Object[2][1];
		
		data[0][0]="name-1";
		data[1][0]="name-2";
		
		return data;
	}
}
