package WebElementStatements.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicElementTest {

	WebDriver driver;

	@Test
	public void atTest() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// login button id get changes after refresh

		driver.findElement(By.xpath("//button[contains(@id, 'u_0_5_')]")).click();
		driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_5_')]")).click();

	}
}