package Selenum_Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUPloadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\Dell\\Documents\\learning Folder\\Upload test document.docx");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
