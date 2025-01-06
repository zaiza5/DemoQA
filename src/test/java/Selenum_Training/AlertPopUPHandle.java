package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import gestures.Webdriver;

public class AlertPopUPHandle {
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(4000); 
		driver.switchTo().alert().accept();	//Accepting the alert	
		
		element.findElement(By.className("fdsfdf"));
		
		
		
	}

}
