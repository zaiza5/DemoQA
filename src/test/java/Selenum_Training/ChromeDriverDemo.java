package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("Executing after setting");
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		
		
		driver.findElement(By.xpath("//*[@id='item-3']/span")).click();
		
	
	
	}

}
