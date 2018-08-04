package codingchallenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).submit();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.close();
	}

}
