package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Honeywell");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Logesh");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Babu");
		
		driver.findElement(By.name("submitButton")).click();
		
		String Leadid = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
				
		String leadid = Leadid.replaceAll("[^0-9]", "");
		
		System.out.println("leadid----------->"+leadid);
		
		
		
		//driver.close();

	}

}
