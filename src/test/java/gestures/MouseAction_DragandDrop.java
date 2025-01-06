package gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_DragandDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions action = new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));		
		action.dragAndDrop(drag, drop).build().perform();
		
		WebElement actualText = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		
		if(actualText.isDisplayed()) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed.");
		}
		
		
		

	}
}
