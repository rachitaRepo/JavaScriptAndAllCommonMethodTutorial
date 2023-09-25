package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowScrollByTest {
	WebDriver driver;
	
@Test
public void atScrollBy() {
	
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	String path = System.getProperty("user.dir");
	
	System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	
	JavascriptExecutor js=(JavascriptExecutor)driver; 
//to scroll window vertically
	js.executeScript("window.scrollBy(0,1000)");     
//to scroll window horizontally	
	js.executeScript("window.scrollBy(1000,0)");
	
	
}
}
