package trial;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static WebDriver driver;

	public static void TakeScreenshot() throws IOException {
		Date date = new Date();
		String name = date.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//Screenshot//" + name));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.hackerrank.com");
		driver.findElement(By.xpath("//*[@id=\"menu-item-2887\"]/a")).click();

		TakeScreenshot();

		//driver.findElement(By.xpath("//*[@id=\"post-175\"]/div/div/div[1]/div/div/div[2]/div[2]/div/div[4]/div/div/a")).click();

	}

}
