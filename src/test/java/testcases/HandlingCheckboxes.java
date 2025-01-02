package testcases;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/select-menu");
		
		
		Select dropdownlist = new Select(driver.findElement(By.id("selectOne")));		
		dropdownlist.selectByIndex(5);

		
		
		
		
	}

}
