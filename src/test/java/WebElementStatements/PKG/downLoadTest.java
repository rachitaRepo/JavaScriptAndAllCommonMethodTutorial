package WebElementStatements.PKG;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class downLoadTest {
	WebDriver driver;

	@Test
	public void atTest() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();

		String downloadPath = System.getProperty("user.dir");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		// ignore all prompt dialog like "are yous u sure to upload ok clode
		chromePrefs.put("profile.default_content_settings.popups", 0);
		// path where want to save
		chromePrefs.put("download.default_directory", downloadPath);

		options.setExperimentalOption("prefs", chromePrefs);

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path1 = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path1 + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='ZIP file']")).click();
		Thread.sleep(5000);

		String filePathUpdated = downloadPath + "\\DownloadDemo-master.zip";
		File file = new File(filePathUpdated);

		Assert.assertTrue(file.exists());

		if (file.exists()) {

			file.delete();

		}
		driver.close();
	}

}
