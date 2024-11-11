package 
gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


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
		WebElement newCar = driver.findElement(By.xpath("//div[text() = 'NEW CARS']"));
		Actions act = new Actions(driver);
		act.moveToElement(newCar).perform();
		//WebElement findNewCar = driver.findElement(By.xpath("//div[text()='Find New Cars']"));
		
		//navigate to New Cars
		driver.findElement(By.xpath("//div[text()='Find New Cars']")).click();		
		
		//verify that the correct page is loaded for new cars
		if (driver.getCurrentUrl().contains("/new-cars/")) {
			System.out.println("Succefully navigated to new cars page");
		}else {
			System.out.println("Failed to navigate to new cars page");
		}
		
		//
		driver.findElement(By.xpath("//span[@data-index='0']")).click();
		//list cars under 6 lakh
		WebElement under6Lack = driver.findElement(By.xpath("//a[text() = 'Under 6 Lakh']"));
		under6Lack.click();
		
		//verify the success of best cars under 6 lack
		if(driver.getCurrentUrl().contains("/best-cars-under-6-lakh/")) {
			System.out.println("Successfully navigated to best cars under 6 lack");
		} else
		{
			System.out.println("Failed to navigate to to best cars under 6 lack");
		}
		//filter by transmission
		WebElement bodytype = driver.findElement(By.xpath("//span[text()='Body Type']"));
		bodytype.click();
		
		WebElement hatchback = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/ul/li[2]/div/div[2]/div/ul/li[3]/label/div/span[2]/div/div/div/img"));
		hatchback.click();
		
		WebElement applychanges = driver.findElement(By.xpath("//button[text()='Apply Changes']"));
		applychanges.click();
		
		
	}

}
