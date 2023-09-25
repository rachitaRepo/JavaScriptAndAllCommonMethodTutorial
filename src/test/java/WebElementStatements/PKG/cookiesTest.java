package WebElementStatements.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookiesTest {

	WebDriver driver;

	@Test
	public void atCookies() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.opera.com/download");
		// dialog should be part of html code
		driver.findElement(By.cssSelector(
				"#cookie-consent > div.cookie-consent__basic.cookie-consent__inner > div > div > span.btn.width-100.btn--primary.cookie-consent__btn.cookie-basic-consent__btn"))
				.click();
		driver.close();

	}
}