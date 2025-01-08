package windodows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWndows {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		
		String parendWindow = driver.getWindowHandle();
		System.out.println("Parent Window id:" + parendWindow);
		
		driver.findElement(By.linkText("Meta Pay")).click();
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String a:allWindows) {
			System.out.println(a);
		} 
		
	}

}
