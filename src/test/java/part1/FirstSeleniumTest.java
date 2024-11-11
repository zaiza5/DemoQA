package part1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

		
	WebDriver driver; 
	
	@BeforeClass
	public void setup(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testloggingIntoApplication() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement  username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
	}
	
	public static void main(String[] args) {
		FirstSeleniumTest test = new FirstSeleniumTest();
		test.setup();
		
	}

}
