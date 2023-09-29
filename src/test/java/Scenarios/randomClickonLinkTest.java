package Scenarios;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Util.myListner;

@Listeners(myListner.class)
public class randomClickonLinkTest {

	WebDriver driver;

	@Test
	public void atWait() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		List<WebElement> lstLinks = driver.findElements(By.tagName("a"));
		Random ran = new Random();

		int size = lstLinks.size();
		System.out.println("Size=" + size);

		// for (int i = 0; i < size; i++) {
		// String URL = lstLinks.get(i).getAttribute("href").toString();
		WebElement randomElement = lstLinks.get(ran.nextInt(size));
		randomElement.click();
		String URLCurr = driver.getCurrentUrl();
		System.out.println("random URL IS " + URLCurr);
		// System.out.println(URL);
		driver.close();
	}
}
