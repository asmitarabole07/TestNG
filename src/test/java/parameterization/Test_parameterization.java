package parameterization;

import java.security.PublicKey;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_parameterization {

	@Test(dataProvider = "getdata")
	public void doLogin(String username, String age) {
		System.out.println(username+"<------->"+age);
	}
	 
	@DataProvider
	public Object[][] getdata()
	{
		 Object[][] data=new Object[2][2];
		 
		 data[0][0]="aaaaa";
		 data[0][1]="bbbbb";
		 data[1][0]="ccccc";
		 data[1][1]="ddddd";
		 
		 return data;
	}
	
	
}
