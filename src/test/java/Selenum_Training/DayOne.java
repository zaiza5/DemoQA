package Selenum_Training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {


	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The page title is "+ title);
		
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("testusers");		
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("@test");		
		driver.findElement(By.xpath("//*[@id='login']")).click();
		
	}

}
