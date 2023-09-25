package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class five_dynamicScpt_getURLtTileTest {
	WebDriver driver;
	
	@Test
	public void atTest() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		// dispaly page title
		
		  String titleofPage=getPageTitle(driver); 
		  System.out.println(titleofPage);
		 
		
		//display page URL
		String URL1=getPageURL(driver);
		System.out.println(URL1);
		
		//clear history
		refreshThePage(driver);
		driver.close();
	
	}
	
	public static String getPageTitle( WebDriver driver) {
		JavascriptExecutor  jse=(JavascriptExecutor)driver;
	
			String titleofPage=jse.executeScript("return document.title").toString();
		return titleofPage;
		
	}
	public static String getPageURL(WebDriver driver) {
		JavascriptExecutor  jse=(JavascriptExecutor)driver;
		String URL1=jse.executeScript("return document.URL").toString();
		return URL1;
		
		
	}
	public static void refreshThePage(WebDriver driver) {
		JavascriptExecutor  jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0)");
		
	}
	

	
		

}

