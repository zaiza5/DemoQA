package Selenum_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "FireFox";
		WebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("CHROME")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://google.com");
		String expectedURL = "https://www.google.com/";
		String actualURL = driver.getCurrentUrl();
		
		if (expectedURL.equals(actualURL)) {
			System.out.println("URL is loaded correctly");
		} else {
			System.out.println("URL loaded incorrectly;");
		}
			
		
	}

}
