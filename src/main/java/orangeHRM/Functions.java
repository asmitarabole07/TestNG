package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Functions{
	

	static WebDriver driver;
	public void beforeSuit() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public void beforeClass() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
	}
	
	public void test_1_select() {
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys("12345");
		
		WebElement status=driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
		Select select=new Select(status);
		select.selectByVisibleText("Full-Time Permanent");
		
		WebElement include=driver.findElement(By.xpath("//select[@id='empsearch_termination']"));
		select=new Select(include);
		select.selectByValue("2");
		
		driver.findElement(By.xpath("//input[@id='empsearch_supervisor_name']")).sendKeys("XYZ");
		
		WebElement title=driver.findElement(By.xpath("//select[@id='empsearch_job_title']"));
		select=new Select(title);
		select.selectByVisibleText("QA Engineer");
		
		WebElement unit=driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']"));
		select=new Select(unit);
		select.selectByValue("3");
	}
	
	public void test_2_passwordReset() {
		driver.findElement(By.xpath("//a[@id='menu_maintenance_purgeEmployee']//b[text()='Maintenance']")).click();
		driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='Verify']")).click();
	}
	
	public void afterSuit() {
		driver.close();
	}

}
