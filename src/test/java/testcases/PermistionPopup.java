package testcases;

import java.lang.classfile.ClassFile.Option;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermistionPopup {

	public static void main(String[] args) {
		//disabling the browser popup not application popup
		ChromeOptions options = new ChromeOptions();
		
		//to handle the popups
		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		//mapping the hashmaps0 = always allow, 1 = Allow, 2 = block)
		/*
		 * Notification = */
		//contentSettings.put("notifications", 1);
		profile.put("managed_default_content_settings", prefs);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);		
		
		//options.addArguments("disable-notifications");
		//add options to chrome driver to disable any popup.		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://whatmylocation.com/");
//		driver.close();
	}

}
