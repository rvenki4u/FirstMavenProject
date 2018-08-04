package week4day1;

import java.util.concurrent.TimeUnit;
import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class SelectableAUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		
		
		Actions builder = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		driver.getKeyboard().sendKeys(Keys.CONTROL);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		item1.click();
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		item3.click();
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		item5.click();
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
		item7.click();
	
		driver.close();
		
	}

}
