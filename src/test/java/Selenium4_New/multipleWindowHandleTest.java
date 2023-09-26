package Selenium4_New;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleWindowHandleTest {
	WebDriver driver;

	@Test
	public void checkboxvalidation() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

//par wind click
		String ParWindow = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();

//get child wind add		
		Set<String> allChildWin = driver.getWindowHandles();

		for (String ChildWin : allChildWin) {

			if (!ChildWin.equals(ParWindow)) {
				driver.switchTo().window(ChildWin);
				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(text);
				driver.close();
				break;

			}

			driver.switchTo().window(ParWindow);
			Thread.sleep(5000);

			driver.findElement(By.id("windowButton")).click();
			Set<String> allChildWin1 = driver.getWindowHandles();
			for (String ChildWinNew : allChildWin1) {

				if (!ChildWinNew.equals(ParWindow)) {
					driver.switchTo().window(ChildWinNew);
					String text = driver.findElement(By.id("sampleHeading")).getText();
					System.out.println(text);
					// driver.close();
					break;

				}

				// driver.switchTo().window(ParWindow);
			}
		}
	}
}