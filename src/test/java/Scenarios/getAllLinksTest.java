package Scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getAllLinksTest {
	WebDriver driver;
	static String URL;

	@Test
	public void atTest() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		atGetAllLinks(driver);

	}

	public static void atGetAllLinks(WebDriver driver) {

		List<WebElement> wb = driver.findElements(By.tagName("a"));
		Integer SIZE = wb.size();
		System.out.println("SIZE=" + SIZE);

		for (int i = 0; i < SIZE; i++) {

			URL = wb.get(i).getAttribute("href");
			System.out.println(URL);
		}

	}
}