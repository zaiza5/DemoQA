package Selenum_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.co.co.za");
		WebElement loginButton = driver.findElement(By.id("js-ddid-btn"));
		loginButton.click();
		//login
		WebElement usrNameTxtbox = driver.findElement(By.id("Username"));
		usrNameTxtbox.sendKeys("cjmorekhure");
		
		
		WebElement usrPsswrd = driver.findElement(By.xpath("//*[@id='Password']"));
		usrPsswrd.sendKeys("Password1");
		
		WebElement clkLginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
		clkLginBtn.click();

		
		
		//WebElement searchTextbox = driver.findElement(By.xpath("));
		//searchTextbox.sendKeys("selenium");
		//System.out.println("Hello World");
		

	}

}
