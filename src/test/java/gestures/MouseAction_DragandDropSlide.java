package gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_DragandDropSlide {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");					
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));		
		Actions slider = new Actions(driver);
		slider.dragAndDropBy(drag, 300, 0).build().perform();
		
		
	}
}
  