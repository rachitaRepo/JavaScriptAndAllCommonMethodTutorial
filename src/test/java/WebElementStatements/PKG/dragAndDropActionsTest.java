package WebElementStatements.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDropActionsTest {
	WebDriver driver;

	@Test
	public void atDragNDrop() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement image = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement trash = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		act.dragAndDrop(image, trash).build().perform();
		driver.close();
	}
}
