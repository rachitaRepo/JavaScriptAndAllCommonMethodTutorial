package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class six_DynScpt_InnerTextofPageTest {
	WebDriver driver;
	@Test
	public void atDisplayInnerTextoFPage() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	//call method
		String InnerTxt=atreturnInnerHTMLTextofEntirePage(driver);
		System.out.println(InnerTxt);
		
		driver.close();
}
	public static String atreturnInnerHTMLTextofEntirePage(WebDriver driver) {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String InnerTxt=jse.executeScript("return document.documentElement.innerText").toString();
		return InnerTxt;
		
	}
}
