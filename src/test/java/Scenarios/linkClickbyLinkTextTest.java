package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Util.myListner;

@Listeners(myListner.class)
public class linkClickbyLinkTextTest {
	WebDriver driver;

	@Test
	public void atTestLinkClick() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
// clcik on footer link
		driver.findElement(By.linkText("Facebook Lite")).click();
//another way by JAVASCRIP
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", driver.findElement(By.linkText("Facebook Lite")));
		driver.close();
	}

}
