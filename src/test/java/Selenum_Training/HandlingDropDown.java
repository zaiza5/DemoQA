package Selenum_Training;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDropDown {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		WebElement langDropdown = driver.findElement(By.id("searchLanguage"));		
		
		Select lang = new Select(langDropdown); 		
		List<WebElement> allOption = lang.getOptions();		
		System.out.println(allOption);
		
		lang.selectByVisibleText("English");
		
		//enhanced for loop
		for (WebElement a:allOption) {
			System.out.println(a.getText());
		}
//		lang.selectByValue("en");
//		Thread.sleep(4000);
//		lang.selectByIndex(4);
//		Thread.sleep(4000);
//		lang.selectByVisibleText("Deutsch");
		
		
		
		
	}

}
