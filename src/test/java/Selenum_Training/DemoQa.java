package Selenum_Training;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoQa {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("f");
		driver.manage().window().maximize();		
		
		driver.findElement(By.id("firstName")).sendKeys("Leina");		
		driver.findElement(By.xpath("//*[@id=\'lastName\']")).sendKeys("Sefane");			
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");		
		driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[1]/label")).click();		
		driver.findElement(By.id("userNumber")).sendKeys("0712345678");		
		driver.findElement(By.id("subjectsContainer")).sendKeys("This is Chimane  Testing");
		
		
		
		
		
		
				
	}

}

