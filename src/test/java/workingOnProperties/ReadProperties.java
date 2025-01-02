package workingOnProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadProperties {
	public static WebDriver driver;
	static FileInputStream fis;
	static Properties config;
	static Properties objectrepository;

	static Logger log =Logger.getLogger(ReadProperties.class);

	public static void main(String[] args) throws IOException {
		 
		
		fis = new FileInputStream("./src/test/resources/properties/config.properties");
		config = new Properties();
		config.load(fis);
		log.info("Config properties file has been loaded.");
		
		//login and password
		fis = new FileInputStream("./src/test/resources/properties/objectrepository.properties");
		objectrepository = new Properties();
		objectrepository.load(fis);
		
		fis = new FileInputStream("./src/test/resources/properties/log4j.properties");
		PropertyConfigurator.configure(fis);
		
		if (config.getProperty("browser").equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
		} 
		else if(config.getProperty("browser").equalsIgnoreCase("Firefox")){
				driver = new FirefoxDriver();
			} else if (config.getProperty("browser").equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}		
		
		driver.manage().window().maximize();
		log.info("Browser has been maximised");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		
		WebDriverWait wait = new WebDriverWait(driver,(Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait")))));
		
		driver.get(config.getProperty("testsiteurl"));
		log.info("Opened url: "+ config.getProperty("testsiteurl"));
		
		System.out.println("The program started.");
				
		driver.findElement(By.id(objectrepository.getProperty("email_ID"))).sendKeys("cjmorekhure@gmail.com");
		System.out.println("Email captured");
		
		driver.findElement(By.id(objectrepository.getProperty("password_ID"))).sendKeys("password1");
		System.out.println("password captured");
		//driver.findElement(By.xpath(objectrepository.getProperty("loginBtn_XPATH"))).click();
		
		WebElement login = driver.findElement(By.xpath("loginBtn_XPATH"));
		login.click();
		
		
		System.out.println("login clicked.");
		System.out.println("The program has completed running.");
		
		
	}

}
