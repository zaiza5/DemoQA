package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.wikipedia.org/");
		
		//getting the links
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));		
		//Printing the size of the link
		System.out.println("Number of Links" + AllLinks.size());
		
		//Printing the webelement to the console.
		for(WebElement a:AllLinks) {
			System.out.println(a.getText());
		}
	}
}
