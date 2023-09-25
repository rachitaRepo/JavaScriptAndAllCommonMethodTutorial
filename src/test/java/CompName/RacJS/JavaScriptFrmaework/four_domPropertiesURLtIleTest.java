package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class four_domPropertiesURLtIleTest {
	public class clickHandle {

		WebDriver driver;
		@Test
		public void atinnerHTMLtext() {
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			String path = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");
			driver.manage().window().maximize();
			
		// creating ref obj of JavAscrExt predefined interface and typecaste the webdriver
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
// to get the innerhtml txt value   <document.getElementById('delayedText').innerHTML>
	String return_value =(String) js.executeScript("return document.getElementById('delayedText').innerHTML");
			System.out.println(return_value);
// to get page title		
		String title=  js.executeScript("return document.title").toString();	
		System.out.println(title);
// to get page url		
		String url= (String) js.executeScript("return document.URL");	
		System.out.println(url);
}
}}