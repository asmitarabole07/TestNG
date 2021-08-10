package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase_report {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setReport() {

		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");

		htmlReporter.config().setEncoding("Extent Report");
		htmlReporter.config().setDocumentTitle("Trial Extent Reports");
		htmlReporter.config().setReportName("Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Automation Tester", "Asmit");

	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@Test
	public void doLogin() {
		test = extent.createTest("User Login Test");
		System.out.println("Executing Login Test");

	}

	@Test
	public void doBuy() {
		test = extent.createTest("User Buy Product Test");
		 Assert.fail("Buy Product Test Failed");

	}

	@Test
	public void doPayment() {
		test = extent.createTest("User Payment Test");
		 throw new SkipException("Skipping test case");
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			String methodName=result.getMethod().getMethodName();
			
			String logText="<b>"+"TEST CASE : "+methodName.toUpperCase()+"  FAILED"+"</b>";
			
			Markup m=MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);
		
		} else if (result.getStatus() == ITestResult.SKIP) {
			String methodName = result.getMethod().getMethodName();

			String logText = "<b>" + "TEST CASE : " + methodName.toUpperCase() + "  SKIPPED" + "</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.BLUE);
			test.skip(m);
		
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			String methodName = result.getMethod().getMethodName();

			String logText = "<b>" + "TEST CASE : " + methodName.toUpperCase() + "  PASSED" + "</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);
		}
	}

}
