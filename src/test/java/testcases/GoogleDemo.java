package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");		
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("student");		
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Password123");
		
		WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
		Submit.click();
		
		//Verifying that the current URL is the same as exptected URL.
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		String ExpectedURL = "https://practicetestautomation.com/logged-in-successfully/";
		
		//check the status
		if(CurrentURL.equalsIgnoreCase(ExpectedURL)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed.");
		}
		
	}

}


