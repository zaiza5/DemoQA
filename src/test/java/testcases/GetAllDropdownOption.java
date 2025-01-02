package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllDropdownOption {

	public static void main(String[] args) {
		//GEt All options - drop down.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.wikipedia.org/");
		
		//Creating an object of the webelement
		WebElement langDropdown = driver.findElement(By.id("searchLanguage"));
		Select lang = new Select(langDropdown);
		List<WebElement> allLang = driver.findElements(By.tagName("option"));
		//size of the element
		System.out.println(allLang.size());
	
		//Getting the elemenets
		for (WebElement a:allLang) {
			System.out.println(a.getText());
		}
		
		//getting the attribute
		for (int i = 0;i<= allLang.size(); i++) {
			System.out.println(allLang.get(i).getAttribute("lang"));
		}		
	}
}
