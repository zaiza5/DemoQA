package testcases;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CalendarTest {
	static WebDriver driver;
	static String url = ("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		try {
			driver.get(url);
			String date = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());			
			driver.findElement(By.id("datepicker")).sendKeys(date);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
