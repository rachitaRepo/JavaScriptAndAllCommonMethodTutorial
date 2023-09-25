package WebElementStatements.PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertionSoftVerifyTest {
	WebDriver driver;

	// verify (soft assertion) continue execution even if conditon fails
	@Test
	public void atVerifySoftAssertion() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();

		SoftAssert sa = new SoftAssert();
		boolean ActualTtile = driver.getTitle()
				.equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack1");

		sa.assertTrue(ActualTtile, "Title not Matched");
//next line will execute evn condiron failed
		System.out.println("OK continue for next NEXT ");
		driver.close();
	}
}