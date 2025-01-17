package Selenum_Training;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {


	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		//driver.get("https://demoqa.com/login");
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The page title is "+ title);
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		
		
//		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("testusers");		
//		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("@test");		
//		driver.findElement(By.xpath("//*[@id='login']")).click();
//		

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Define the destination for the screenshot
        File destination = new File("screenshot.png");
        FileUtils.copyFile(screenshot, destination);
        String path = destination.getAbsolutePath();
        System.out.println(path);
      //  System.out.println("Screenshot saved at: " + destination.getAbsolutePath());

	}
}
