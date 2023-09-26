package Selenium4_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class relativeLocators {
	WebDriver driver;

	@Test
	public void checkboxvalidation() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.name("email")).sendKeys("qa@qa.qa");
		WebElement pass = driver.findElement(By.name("password"));
		driver.findElement(By.name("password")).sendKeys("test01");

		// relative locatr to clik on login button
		// we shall ffind the relative objec near to click button
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(pass)).click();

	}
}