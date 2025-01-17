package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase2 {
	WebDriver driver;
	String url = "www.google.com";
	@BeforeSuite
	public void doConfig() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
	}
	@Test
	public void doLogin() {
		System.out.println("Testing Passed");
			}		
}
