package WebElementStatements.PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsHardTest {
	WebDriver driver;

//assert halt the execution of program if condition is fails
	@Test
	public void atAssertion() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
//method to verify the title of page

		String ActualTitle = verifyTitleOfthepagebyStringReturnType(driver);
		System.out.println(ActualTitle);
		driver.close();

	}

	@Test
	public void atAssertionSoft() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();

//another boolena method
		boolean ActualTitle1 = verifyTitleOfthepageByBooleanReturnType(driver);

		System.out.println("Boolean value=" + ActualTitle1);
		driver.close();

	}

	public static String verifyTitleOfthepagebyStringReturnType(WebDriver driver) {

		// soft assertion halt the execution if condition false
		String Expectedtitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		String ActualTitle = driver.getTitle();

		Assert.assertEquals(Expectedtitle, ActualTitle, "Title not matched");
		return ActualTitle;

	}

	public static boolean verifyTitleOfthepageByBooleanReturnType(WebDriver driver) {

		// soft assertion halt the execution if condition false

		boolean ActualTitle = driver.getTitle()
				.equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");

		Assert.assertTrue(ActualTitle);
		return ActualTitle;

	}

}
