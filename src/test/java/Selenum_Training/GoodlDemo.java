package Selenum_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		driver.findElement(By.id("js-ddid-btn")).click();
		
		//login
		driver.findElement(By.id("identifierId")).sendKeys("cjmorekhure@gmail.com");		
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Password1");		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		

		
		
		//WebElement searchTextbox = driver.findElement(By.xpath("));
		//searchTextbox.sendKeys("selenium");
		//System.out.println("Hello World");
		

	}

}
