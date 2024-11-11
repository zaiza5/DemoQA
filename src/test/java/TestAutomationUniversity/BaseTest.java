package TestAutomationUniversity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
		private WebDriver driver;
		
		public void setup() {
			ChromeDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/");
			System.out.println(driver.getTitle());
		}

		public static void main(String[] args) {		//
			BaseTest test = new BaseTest();
			test.setup();
			
		}
}
