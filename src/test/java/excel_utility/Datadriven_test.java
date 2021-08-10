package excel_utility;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriven_test {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Form");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(dataProvider = "getData")
	public void registration(String firstname, String lastname, String dob, String phonenumber, String username,
			String email, String about, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Single']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Cricket']")).click();
		WebElement country=driver.findElement(By.xpath("//select[@id='sel1']"));
		Select select=new Select(country);
		select.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(dob);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys(phonenumber);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys(about);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

	}
	
	@DataProvider
	public Iterator<Object[]> getData() {
		ArrayList<Object[]> testdata=TestUtil.getDataFromExcel();
		return testdata.iterator();
	}

}
