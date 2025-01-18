package TestNG;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG {

	WebDriver driver;
	@BeforeMethod
	public void Config(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("http://automationexercise.com");			
	}		

	@Test(priority=1)
	public void SignUpDetails(){		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("name")).sendKeys("Tester Persons");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("zaizab_@hotmail.com");	
		driver.findElement(By.xpath("//button[text()='Signup']")).click();		
	}

	@Test(priority=2,dependsOnMethods = "SignUpDetails")
	public void CaptureSignupDetails() {
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.id("password")).sendKeys("password1");		
		Select day = new Select(driver.findElement(By.xpath("//select[@id='days']")));
		day.selectByIndex(8);
		Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		month.selectByIndex(6);
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("1990");
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();		
		driver.findElement(By.xpath("//input[@id='optin']")).click();			
	}
	@Test(priority=3, dependsOnMethods = "CaptureSignupDetails")
	public void AddressInfomation() {
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Chimane");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Morekhure");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Morekhure inc");
		//address
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("516 Ralihlaba Street");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Phadima Section");		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText("Singapore");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Katlehong");	
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Katlehong");	
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("1432");	
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("0741234567");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();		
	}
	@Test(priority=4)
	public void ScreenShort() {
		//Take screenshort and store as a file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		//now copy the screenshot to desired location usint the copyFile method
		try {
			FileUtils.copyFile(src, new File("./Selenium_Maven//test-output\\userregistration.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test has been completed."); 	
	}	
	
	@AfterMethod
	public void closewindow() {
		driver.quit();
	}

}

