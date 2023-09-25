package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seven_DynaScpt_ScrollPageTest {
	
	WebDriver driver;
	@Test
	public void atScrollingFeature() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
	//call method
		atScrollPageUntilElemNotVisible(driver);
		System.out.println("element is visible");
		
		atPageScrollTillEnd(driver);
		System.out.println("Page Scrolled till end");
		driver.close();
}
	
//to scroll until webele not visisble
	public static void atScrollPageUntilElemNotVisible(WebDriver driver) {
		
			JavascriptExecutor  jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('but2').scrollIntoView(true)");
		
		//one way to click
			WebElement butn=driver.findElement(By.id("but2"));
			jse.executeScript("arguments[0].click()", butn);
			
		//another way to click
			//jse.executeScript("document.getElementById('but2').click()");
			
		}	
		
//reusable method to scroll page till end
		public static void atPageScrollTillEnd(WebDriver driver) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
		

}
