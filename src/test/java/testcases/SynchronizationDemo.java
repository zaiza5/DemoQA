package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https:/gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("zaiza52010@gmail.com");		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
	}

}
