package WebElementStatements.PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicDropDownTest {

	WebDriver driver;

	@Test
	public void dynamicDropDownHandling() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

	}

	public static void handleDynamicDropDown(WebDriver driver) {

	}
}