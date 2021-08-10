package excel_utility_2;

import java.util.ArrayList;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class excel_util {
	
	public static ArrayList<Object[]> getExcelData() {
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\Administrator\\Desktop\\filewriting\\login.xlsx");
		
		ArrayList<Object[]> userdata=new ArrayList<Object[]>();
		
		for(int rownum=2;rownum<=reader.getRowCount("data");rownum++)
		{
			String name=reader.getCellData("data", "UserName", rownum);
			String pass=reader.getCellData("data", "Password", rownum);
		
			Object[]ob= {name,pass};
			userdata.add(ob);
		
		}
	
		return userdata;
	
	}


}
