package 
gestures;

import java.lang.classfile.ClassFile.Option;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MouseAction_MoveToElements {

	public static void main(String[] args) {
		//Disable any pop up
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		
				
		//maximize window		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.carwale.com/");
		
		//checking the new cars list
		Actions act = new Actions(driver);
		WebElement newCar = driver.findElement(By.xpath("//div[text() = 'NEW CARS']"));		
		act.moveToElement(newCar).perform();	
		
		//navigate to New Cars
		driver.findElement(By.xpath("//div[text()='Find New Cars']")).click();		
		driver.findElement(By.xpath("//div[text()='Hyundai']")).click();
		
		//sorting Hyundai Cars with Price from Low to High
		WebElement selectField = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[3]/div[1]/section/div/div[1]/div/div/div[2]/div/div/div/div/select"));
		Select list = new Select(selectField);
		list.selectByVisibleText("Price - Low to High");		
		
		if(driver.getCurrentUrl().contains("/hyundai-cars/")) {
			System.out.println("Test Passed.");
		} else {
			System.out.println("Test Failed.");
		}
	}
}
