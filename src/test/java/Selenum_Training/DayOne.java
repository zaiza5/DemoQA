package Selenum_Training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DayOne {


	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The page title is "+ title);
		
		WebElement uname = driver.findElement(By.xpath("//*[@id='userName']"));
		uname.sendKeys("testusers");				
		WebElement upssd = driver.findElement(By.xpath("//*[id=\"password\"]"));		
		upssd.sendKeys("@test");
		WebElement uloginbut = driver.findElement(By.xpath("//*[@id='login']"));
		uloginbut.click();
		
	}

}
