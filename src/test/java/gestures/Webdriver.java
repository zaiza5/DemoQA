package gestures;

import java.lang.classfile.ClassFile.Option;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Webdriver {
	public static void main(String[]args) {
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-notifications"); 
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.carwale.com/new-cars/");
		
		
		
	}
	
	

}
