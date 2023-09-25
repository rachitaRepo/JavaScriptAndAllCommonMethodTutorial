package WebElementStatements.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class autoSuggestive_DynamicDropDownTest {
	WebDriver driver;

	@Test
	public void atTest() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// clcik on from
		driver.findElement(By.xpath("//div[text()='From']")).click();

		// select value
		driver.findElement(By.xpath("//div[text()='Netaji Subhash Chandra Bose International Airport']")).click();
		Thread.sleep(2000);
		// clcik on to
		// driver.findElement(By.xpath("//div[text()='To']")).click();

		driver.findElement(By.xpath("// div[text()='Indira Gandhi International Airport']")).click();
		driver.close();
	}
}