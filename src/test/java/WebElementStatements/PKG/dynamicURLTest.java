package WebElementStatements.PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicURLTest {

	WebDriver driver;

	@Test
	public void atHandleDynamicURL() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		String currentURL = toGetCurrentURL(driver);
		System.out.println("currentURL is=" + currentURL);
		driver.close();
	}

	public static String toGetCurrentURL(WebDriver driver) {

		String currentURL = driver.getCurrentUrl().toString();

		return currentURL;
//dynamic url can be handledby takling linktext Values of HREF as ell
		// driver.findElement(By.linkText("Facebook Lite")).click();

	}

}
