package gestures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_DragandDropResize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");					
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));		
		Actions action = new Actions(driver);
		action.dragAndDropBy(drag, 500, 300).build().perform();
	}
}
