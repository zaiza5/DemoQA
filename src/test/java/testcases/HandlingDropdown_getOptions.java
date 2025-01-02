package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown_getOptions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/form-fields/");
		
		WebElement dropdownlist = driver.findElement(By.id("automation"));		
		Select selectOption = new Select(dropdownlist);		
		
		//Getting all option listed on the dropdown
		List<WebElement> allOptions = selectOption.getOptions();
		
		//Number of options listed on the dropdown
		System.out.println("The size for the all Options is :" + allOptions.size());	
		//Displaying all options on the console
		for(WebElement a:allOptions) {
			System.out.println(a.getText());
		//doing my selection	
		selectOption.selectByVisibleText("Yes");
		}
	}

}
