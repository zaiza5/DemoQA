package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

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
		driver.findElement(By.xpath("//*//input[@name=\"name\"]")).sendKeys("Chimane");			
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("cjmorekhure@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
		
		//complete the sign up details
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("Password1");
		
		//Day of birth
		WebElement day = driver.findElement(By.id("days"));
		Select dayOfBirth = new Select(day);
		dayOfBirth.selectByIndex(18);
		
		//Month of birth
		WebElement month = driver.findElement(By.id("months"));
		Select monthOftheYear = new Select(month);
		monthOftheYear.selectByIndex(01);
		
		//Year of birth
		WebElement yearofBirth = driver.findElement(By.id("years"));
		Select year = new Select(yearofBirth);
		year.selectByVisibleText("1982");
		
		//ticking the newsletter
		driver.findElement(By.xpath("//*[@for='newsletter']")).click();
		
		//Address infomation
		driver.findElement(By.id("first_name")).sendKeys("Chimane");
		driver.findElement(By.id("last_name")).sendKeys("Morekhure");
		driver.findElement(By.id("address1")). sendKeys("516 Ralihlaba Street");
		driver.findElement(By.id("address2")).sendKeys("Phalime Section");
		
		//selecting the country
		WebElement countries = driver.findElement(By.id("country"));
		Select country = new Select(countries);
		country.selectByVisibleText("Australia");
		
		driver.findElement(By.id("state")).sendKeys("Germiston");
		driver.findElement(By.id("city")).sendKeys("Katlehong");
		driver.findElement(By.id("zipcode")).sendKeys("1432");
		driver.findElement(By.id("mobile_number")).sendKeys("072 123 4567");
		
		//create button click
		driver.findElement(By.xpath("//*[@type=\'submit\'][1]")).click();
		System.out.println("Account infmation has been created successfully");
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		System.out.println("day of birth is "+ day.getText());
		
		
		//System.out.println("You have successfully typed your details");
		
		
	
		
		
	}

}
