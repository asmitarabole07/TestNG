package parameterization;

import java.lang.reflect.Method;

import javax.sound.midi.Soundbank;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_dataProvider {
	
	
	@DataProvider(name = "db1")
	public Object[][] getdata(Method m) {
		Object[][] data=null;
		if(m.getName().equals("test1")) {
		data=new Object[2][2];
		
		data[0][0]="A";
		data[0][1]="B";
		data[1][0]="C";
		data[1][1]="D";
		}
		else if (m.getName().equals("test2")) {
			data=new Object[2][3];
			
			data[0][0]="A";
			data[0][1]="B";
			data[0][2]="B";
			
			data[1][0]="C";
			data[1][1]="D";
			data[1][2]="D";
		}
		return data;
	
}
	
	@Test(dataProvider = "db1")
	public void test1(String username,String password) {
		System.out.println(username+"------"+password);
	}
	
	@Test(dataProvider = "db1")
	public void test2(String username,String pass,String age) {
		System.out.println(username+"----"+pass+"-----"+age);
	}

}
