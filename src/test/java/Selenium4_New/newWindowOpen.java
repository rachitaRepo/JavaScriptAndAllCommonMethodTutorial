package Selenium4_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newWindowOpen {
	WebDriver driver;

	@Test
	public void checkboxvalidation() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.google.com/search?q=java&sca_esv=568381026&sxsrf=AM9HkKkND3zyswyFuuiZMShbRnVijhnxKw%3A1695696311240&source=hp&ei=t0USZaDeDOrdseMP57Ke2Ak&iflsig=AO6bgOgAAAAAZRJTx8MPsyjkkyfHChXMo9MKsPMS3pgd&ved=0ahUKEwjglZuCoceBAxXqbmwGHWeZB5sQ4dUDCAk&uact=5&oq=java&gs_lp=Egdnd3Mtd2l6IgRqYXZhMgcQIxiKBRgnMgQQIxgnMgQQIxgnMggQABiKBRiRAjIHEAAYigUYQzIHEAAYigUYQzINEAAYigUYsQMYgwEYQzIKEAAYigUYsQMYQzIHEAAYigUYQzIJEAAYigUYChhDSNkJULoFWIYIcAF4AJABAJgBmwGgAeUEqgEDMC40uAEDyAEA-AEBqAIKwgIHECMY6gIYJ8ICCxAuGIMBGLEDGIAEwgILEAAYgAQYsQMYgwHCAgsQABiKBRixAxiDAcICBRAAGIAEwgIHEC4YigUYQw&sclient=gws-wiz");

		// open URL in new Window
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		driver.get("https://www.w3schools.com/java/");
		System.out.println(driver.getTitle());
	}
}