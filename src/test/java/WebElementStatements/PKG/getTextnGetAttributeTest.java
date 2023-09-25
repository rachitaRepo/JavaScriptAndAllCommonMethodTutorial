package WebElementStatements.PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getTextnGetAttributeTest {
	WebDriver driver;

	@Test
	public void atTest() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/forgotten");
//get innertext of webelemnet which can be dispalyed easily and this trim all spaces and provide text in oneline
		//mainly this text is inetween starting n closing tags
		System.out.println("get Text" + driver.findElement(By.xpath("//div[@id='content']/h1")).getText());
//get innertext of webelemnet which is hiddn by CSS and this is in paragrabhp bring text as it is in HTML code	
		System.out.println("get Text" + driver.findElement(By.xpath("//div[@id='content']/h1")).getAttribute("innerHTML"));
		
		
		/*
		 * 
		 * System.out.println("InnerTextHidden1" +
		 * driver.findElement(By.id("content")).getAttribute("innerText"));
		 * System.out.println("InnerContent with tag" +
		 * driver.findElement(By.id("content")).getAttribute("textContent"));
		 * System.out.println("InnerTextHidden2"
		 * +driver.findElement(By.id("content")).getAttribute("innerHTML"));
		 */
	}

}
