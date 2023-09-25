package CompName.RacJS.JavaScriptFrmaework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//  You tube Link   < https://www.youtube.com/watch?v=noQ2Zy3Dhsw  >

public class two_DomStatements2Test {
	WebDriver driver;
	@Test
	public void atclickHandle() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		 
		//click elemnet by id
				
			js.executeScript("document.getElementById('alert1').click()");
//click elemnet by name, calss name , tag
	js.executeScript("document.getElementsByClassName('gsc-search-button')[0]");
//click element by  name with value
			js.executeScript("document.getElementsByName('userid')[0].value='rachita'");
//get elemet by tag name
			js.executeScript("document.getElementsByTagName[10].click()");

//get elemet by queryselectr.... take xpath change into CSS Selector <https://cssify.appspot.com/>
			js.executeScript("return document.querySelector('input[value=Login]').style.color='red'");
			
			js.executeScript("return document.querySelector('input[value=Login]').style.background='yellow'");
}
}