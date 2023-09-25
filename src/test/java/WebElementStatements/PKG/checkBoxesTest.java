package WebElementStatements.PKG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkBoxesTest {
	WebDriver driver;

	@Test
	public void checkboxvalidation() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");

		// driver.findElement(By.xpath("//label[text()='Railway Pass
		// Concession']")).click();

		// get all checkbpox values

		List<WebElement> lst = driver.findElements(By.xpath("(//div[@class='col-xs-12 remove-padding'])[1]"));

		for (WebElement i : lst) {
			i.getText();
			System.out.println(i.getText());

			if (i.getText().equalsIgnoreCase("Person With Disability Concession")) {
				// i.clear();
				i.click();

			}

		}
		driver.close();
	}
}
