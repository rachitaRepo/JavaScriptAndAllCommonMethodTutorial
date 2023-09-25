package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Updated comment
public class clickHandleAnotherWayTest {

	WebDriver driver;

	@Test
	public void atclickHandle() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		// creating ref obj of JavAscrExt predefined interface and typecaste the
		// webdriver
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Storing webelemnet
		WebElement clickBtn = driver.findElement(By.id("alert1"));

		js.executeScript("arguments[0].click()", clickBtn);

		Alert atr = driver.switchTo().alert();
		atr.getText();
		atr.accept();
		driver.close();

	}
}
