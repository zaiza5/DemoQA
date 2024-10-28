package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoQa {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		WebElement usrName = driver.findElement(By.id("firstName"));
		usrName.sendKeys("Name");
		
		WebElement usrLastName = driver.findElement(By.xpath("//*[@id=\'lastName\']"));
		usrLastName.sendKeys("Surname");
		
		WebElement emailAddress = driver.findElement(By.id("userEmail"));
		emailAddress.sendKeys("test@gmail.com");
		
		WebElement genderRadioButton = driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[1]/label"));
		genderRadioButton.click();
		
		WebElement cellNumber = driver.findElement(By.id("userNumber"));		
		cellNumber.sendKeys("0712345678");
		
		WebElement subject = driver.findElement(By.id("subjectsContainer"));
		subject.sendKeys("This is Chimane  Testing");
		
		
				
	}

}

