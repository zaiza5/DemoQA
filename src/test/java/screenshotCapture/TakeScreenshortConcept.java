package screenshotCapture;

import java.io.File;
import java.io.IOException;
import java.lang.classfile.ClassFile.Option;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreenshortConcept {
	
	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.carwale.com");
		
		//Take screenshort and store as a file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		//now copy the screenshot to desired location usint the copyFile method
		FileUtils.copyFile(src, new File("C:\\Users\\Dell\\eclipse-workspace\\Selenium_Maven\\src\\test\\java\\screenshotCapture\\carwaleImage.png"));
		System.out.println("Test has been completed."); 
	}

}

