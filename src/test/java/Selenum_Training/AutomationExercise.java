package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationExercise {

	public static void main(String[] args) {
		//Disable any pop up
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(opt);
		
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://automationexercise.com/login");
		WebElement name = driver.findElement(By.xpath("//*//input[@name=\"name\"]"));
		name.sendKeys("Chimane");		
		
		WebElement psswrd = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
		psswrd.sendKeys("cjmorekhure@gmail.com");
		
		WebElement signupbuttn = driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
		signupbuttn.click();
		System.out.println("You have successfully typed your details");
	
		
		
	}

}
