package CompName.RacJS.JavaScriptFrmaework;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one_allAertsRuntimeTest {
	
	WebDriver driver;
	

	@Test
	public void atTest() throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 
//Display alert on page runtime  with OK button
		
		js.executeScript("alert('rachitabhandari')");
		Thread.sleep(1000);
		Alert atr=driver.switchTo().alert();

		atr.accept();
//Display prompt on page... take input value 'name' with OK and cancel button
		js.executeScript("prompt('what is yr name')"); //give name runtime
		atr.accept();
		
//Display confirmation dialog with ok and cancel button
		js.executeScript("confirm('are you sure want to quit')");
		atr.accept();
		

		
	}
}
