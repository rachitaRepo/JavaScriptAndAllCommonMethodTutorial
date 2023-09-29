package Scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class screenShots {
	WebDriver driver;

	@Test
	public void atTestSS(ITestResult result) throws IOException {

		if (!result.isSuccess()) {

			String name = result.getClass().getName();

			String locPath = "D://";
			String DesiPath = locPath + name + ".jpg";

			File srcScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File DesFile = new File(DesiPath);
			// FileUtils.copyFile(srcScreen, DesFile);
			FileUtils.moveFile(srcScreen, DesFile);
		}
		driver.close();
	}
}
