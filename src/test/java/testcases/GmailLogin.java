package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gestures.Webdriver;


public class GmailLogin {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
	
	driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();	
	driver.findElement(By.xpath("//input[@name = 'identifier']")).sendKeys("test@gmail.com");	
	//wait.until(ExpectedConditions.elementToBeClickable("//*[@id=\"identifierNext\"]/div/button/span"));
	
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	
	
	
	}

}
