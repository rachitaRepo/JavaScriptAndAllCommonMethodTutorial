package WebElementStatements.PKG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDownStatticTest {
	WebDriver driver;

	@Test
	public void atTest() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		// select tag

		Select newdropdown = new Select(driver.findElement(By.name("country")));

		// newdropdown.selectByValue("ALBANIA");
		// newdropdown.selectByVisibleText("AMERICAN SAMOA");
		// newdropdown.selectByIndex(12);
		List<WebElement> lstcountry = newdropdown.getOptions();

		System.out.println("No of items=" + lstcountry.size());
		for (int i = 0; i < lstcountry.size(); i++) {

			String countryName = lstcountry.get(i).getText();
			if (countryName.equalsIgnoreCase("ANTARCTICA")) {

				lstcountry.get(i).click();
				System.out.println(countryName);

			}

		}

		driver.close();

	}
}