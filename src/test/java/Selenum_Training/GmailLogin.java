package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//clicking the Sing in button
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");			
		driver.findElement(By.id("pass")).sendKeys("password1");				
		System.out.println("typing is completed.");
		
		//Click button
		driver.findElement(By.name("login")).click();
		System.out.println("The click of a button is successfully.");
		System.out.println("Login Successfully!");				

	}

}
