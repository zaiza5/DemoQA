package SeleniumPracticals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {

	public static void main(String[] args) {
		String browserName = "chrome";
		WebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("successfully opened the Chrome");
		}else if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			System.out.println("successfully opened the Firefox");
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();			
			System.out.println("successfully opened the Edge");
		}
		
		driver.get("https://google.com");
		System.out.println("You are done with opening the browser.");
		
		
		String actualURL = "https://www.google.com/"; 
		String expectedURL = "https://www.google.com/";
		
		if(actualURL.equalsIgnoreCase(expectedURL)) {
			System.out.println("The test has passed");
		}else {
			System.out.println("The test has failed!");
		driver.manage().window().maximize();
		}
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		driver.close();
	}

}
