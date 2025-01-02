package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		WebElement dropDownLanguage = driver.findElement(By.id("searchLanguage"));
		Select lang = new Select(dropDownLanguage);		
			
		Thread.sleep(2000);		
		lang.selectByValue("it");
		Thread.sleep(2000);
		lang.selectByIndex(4);
		Thread.sleep(2000);
		lang.selectByVisibleText("Afrikaans");		
		
		System.out.println("The Language has been selected.");
		driver.quit();
		System.out.println("done.");
		

	}

}
