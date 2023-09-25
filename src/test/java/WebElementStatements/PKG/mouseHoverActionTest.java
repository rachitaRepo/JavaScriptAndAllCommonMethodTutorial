package WebElementStatements.PKG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseHoverActionTest {
	WebDriver driver;

	@Test
	public void atTest11() {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

// Locating the Main Menu (Parent element)
		WebElement wb = driver.findElement(By.xpath("//a[text()='Desktops']"));

//define action class obj
		Actions act = new Actions(driver);

//hover in main menu
		act.moveToElement(wb);

//// Locating the SubMain Menu
		WebElement wbsub = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
//hover in submenu
		act.moveToElement(wbsub).click();
//perform all action together

		act.build().perform();
		driver.close();

	}
}