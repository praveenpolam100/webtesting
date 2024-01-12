package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class First1 {

	private WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();

	}

	@Test
	public void searchGoogle() {
		driver.get("http://google.com");
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("Hyderabad");
		searchbox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test
	public void searchGoogle1() {
		driver.get("http://google.com");
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		searchbox.sendKeys("Dallas");
		searchbox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
