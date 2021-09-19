package trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mongodb.diagnostics.logging.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocation_multile {
	
	org.testng.log4testng.Logger log=org.testng.log4testng.Logger.getLogger(Invocation_multile.class);

	@Test(invocationCount =3,threadPoolSize = 2 )
	public void launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		log.info("navigated to google");
		
		driver.quit();
		
		
	}
}
