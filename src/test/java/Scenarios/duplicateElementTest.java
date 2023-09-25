package Scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class duplicateElementTest {
	WebDriver driver;

	@Test
	public void atDuplicate() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		List<WebElement> lst = driver.findElements(By.id(""));

		lst.size();
		for (int i = 0; i < lst.size(); i++) {
			String text = lst.get(i).getText();

			if (!text.equalsIgnoreCase("XXX")) {
				// performa some action;
			}
		}
		/*
		*/

	}
}