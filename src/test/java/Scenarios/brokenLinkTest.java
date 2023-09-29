package Scenarios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Util.myListner;

@Listeners(myListner.class)
public class brokenLinkTest {
	WebDriver driver;

	@Test
	public void atBrokenLink() throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

		identifyBrokenURL(driver);
		driver.close();

	}

	public static void identifyBrokenURL(WebDriver driver) throws MalformedURLException, IOException {
		// store ALL link in a list

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		for (WebElement link : allLinks) {

			String URL = link.getAttribute("href");

			System.out.println(URL);

			if (URL == null || URL.isEmpty()) {

				System.out.println("URL is empty");
				continue;
			}

			// get the http response code from server reqiuest made
			// by using the predifned interface

			HttpURLConnection huc = (HttpURLConnection) (new URL(URL).openConnection());

			huc.connect();

			if (huc.getResponseCode() > 400) {
				System.out.println(URL + " is broken");
			} else {
				System.out.println(URL + " is valid");
			}

		}

	}
}
