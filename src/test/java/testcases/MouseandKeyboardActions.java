package testcases;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");		
		
		Actions actions = new Actions(driver);
		
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		WebElement seleniumONeByArun = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[3]/a/span"));
		
		actions.moveToElement(blogsMenu).moveToElement(seleniumONeByArun)
		.keyDown(Keys.CONTROL).click()
		.keyUp(Keys.CONTROL).build().perform();		
	}

} 
