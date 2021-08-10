package excel_utility;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel()
	{
		
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		
		reader=new Xls_Reader("C:\\Users\\Administrator\\Desktop\\filewriting\\data.xlsx");
		
		for(int rowNum=2;rowNum<=reader.getRowCount("userdata");rowNum++)
		{
			String first=reader.getCellData("userdata","Firstname", rowNum);
			String last=reader.getCellData("userdata","Lastname", rowNum);
			String dobb=reader.getCellData("userdata","Dob", rowNum);
			String phone=reader.getCellData("userdata","PhoneNumber", rowNum);
			String user=reader.getCellData("userdata","Username", rowNum);
			String emai=reader.getCellData("userdata","Email", rowNum);
			String abo=reader.getCellData("userdata","About", rowNum);
			String pass=reader.getCellData("userdata","Password", rowNum);
			
			Object[] ob= {first,last,dobb,phone,user,emai,abo,pass};
			mydata.add(ob);
			
		}
		
		return mydata;
	}
}
