package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class eight_DynScpt_InputValueTest {
WebDriver driver;
	
	@Test
	public void atTest() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		
		//call
		WebElement searchBoxField =driver.findElement(By.name("search"));
		
		javaScriptGettextinInputBox(driver,searchBoxField,"HP"); 
		System.out.println("hp entered");
		
				driver.close();
}
	
	//reusbale method to get the seracgh text in box
	
	public static void javaScriptGettextinInputBox(WebDriver driver, WebElement element, String texttobeTyped) {
		
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='"+ texttobeTyped +"'", element);
			
		// document.getElementsByName('search')[0].values='HP'
	}
	
}
