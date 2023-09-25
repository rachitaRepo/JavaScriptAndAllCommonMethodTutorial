package WebElementStatements.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadFileDownloadTest {
	WebDriver driver;

	@Test
	public void atTest() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
//upload file
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\rachi\\Downloads\\sampleFile.jpeg");
		// download file

	}
}
