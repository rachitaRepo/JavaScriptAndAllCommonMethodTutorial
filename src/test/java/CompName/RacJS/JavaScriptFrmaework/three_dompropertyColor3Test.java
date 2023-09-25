package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class three_dompropertyColor3Test {
	WebDriver driver;
	@Test
	public void atColorChange() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
	//changing the background color and font color	
		js.executeScript("return document.getElementById('delayedText').style.color='green'");
		js.executeScript("return document.getElementById('delayedText').style.background='blue'");
	}

}
