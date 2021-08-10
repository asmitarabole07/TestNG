package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot extends Capture_Screenshot {

	

	public static void TakeScreenshot(String testMethodName) throws IOException {
		Date date = new Date();
		String name = date.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Administrator\\Desktop\\Programme files\\Java\\eclipse-workspace\\TestNG\\screenshots\\"+testMethodName+name));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
