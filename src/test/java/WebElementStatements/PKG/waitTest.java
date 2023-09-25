package WebElementStatements.PKG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitTest {
	WebDriver driver;

	// verify (soft assertion) continue execution even if conditon fails
	@Test
	public void atWait() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// selenium 4 syntax implicit wait, old way has depricated
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// explictit wait old way has depricated
		// old way WebDriverWait wb1 = new WebDriverWait(driver,20);
		// new way in sel 4

		driver.get("https://www.browserstack.com/");

		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(20));
		wb.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("xxx"))));

		driver.close();
	}
}
