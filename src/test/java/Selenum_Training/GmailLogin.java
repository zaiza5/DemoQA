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
		WebElement enterEmail = driver.findElement(By.name("email"));
		enterEmail.sendKeys("test@gmail.com");		
		
		WebElement pssWrd = driver.findElement(By.id("pass"));
		pssWrd.sendKeys("password1");
				
		
		//Click button
		WebElement clickNextbtn = driver.findElement(By.name("login"));
		clickNextbtn.click();
		System.out.println("Login Successfully!");				

	}

}
