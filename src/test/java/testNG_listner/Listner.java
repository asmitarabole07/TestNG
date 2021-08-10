package testNG_listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// Below line is for Report NG
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		Reporter.log("<a href=\"C:\\Users\\Administrator\\Desktop\\Wallpics\\a.jpg\" target=\"_blank\">Failed element screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\Administrator\\Desktop\\Wallpics\\a.jpg\" target=\"_blank\"><img height=100 width=150 src=\"C:\\Users\\Administrator\\Desktop\\Wallpics\\b.jpg\"></a>");
		System.out.println("Testcase failed---x  : "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Testcase Skipped---**  :  "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}