package workingOnProperties;

import java.awt.image.CropImageFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingPropertiesSample {
	static WebDriver driver;
	static FileInputStream fis;
	static Properties config;	

	public static void main(String[] args) throws IOException {
		//loading the properties
		fis = new FileInputStream("./src/test/resources/properties/automationexcercise.properties");
		config = new Properties();
		config.load(fis);		
		//Seting the browser driver
		if(config.getProperty("browser").equalsIgnoreCase("Chrome")){
			driver= new ChromeDriver();
		} else if(config.getProperty("browser").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();		
		}else if(config.getProperty("browser").equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		System.out.println(config.getProperty("browser"));
		
		//normal config
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(config.getProperty("url"));				
		
		driver.findElement(By.name(config.getProperty("signup_NAME"))).sendKeys("Chimane");
		driver.findElement(By.xpath(config.getProperty("email_XPATH"))).sendKeys("cjmorekhure@gmail.com");
		driver.findElement(By.xpath(config.getProperty("signupbtn_XPATH"))).click();
		System.out.println("Signup button clicked successfully.");
	}

}
