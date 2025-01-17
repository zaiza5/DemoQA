package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {
	public WebDriver driver;
	String ulr = "https://practice-automation.com/";
	
	@BeforeMethod
	public void setUP() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get(ulr);
		System.out.println("Open Browser.");
	}
	
	@Test
	public void userReq() {
		System.out.println("Testing Passed");
		}
		
	@Test		
	public void doUserReg() {
		System.out.println("Testing the browser.");
	}
	@AfterMethod
	public void dloseBrowser() {
	System.out.println("Close browser.");  
	}
	
}
