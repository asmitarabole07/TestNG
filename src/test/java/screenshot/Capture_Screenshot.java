package screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(ListnerTest.class)
public class Capture_Screenshot {
	
	static WebDriver driver;
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mvnrepository.com/artifact/org.slf4j/slf4j-simple/1.6.2");
	}

	@Test
	public void mvnTest() {
			driver.findElement(By.xpath("//input[@id='quer']")).sendKeys("Apache");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
