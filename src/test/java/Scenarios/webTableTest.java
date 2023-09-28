package Scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTableTest {
	WebDriver driver;

	@Test
	public void Table() throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");

//WebTable take as whole , Inspect Table where it starting

		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		int rows = row.size();
		System.out.println("No of Rows are =" + rows);

		List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/th"));
		int cols = col.size();
		System.out.println("No of cols are =" + cols);

		// for loop to geteach row data in cols
		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				String text = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();

				System.out.println(text + " ");
			}
			System.out.println();
		}
	}

}