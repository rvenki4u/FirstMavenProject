package codingchallenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	      driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	      driver.findElementById("username").sendKeys("DemoSalesManager");
		  driver.findElementById("password").sendKeys("crmsfa");
		  driver.findElementByClassName("decorativeSubmit").click();
		  driver.findElementByLinkText("CRM/SFA").click();
		  
		  driver.findElementByLinkText("Leads").click();
		  
		  driver.findElementByLinkText("Find Leads").click();
		  
		  driver.findElementByName("firstName").sendKeys("sarvesh");
		  
		  driver.findElementByXPath("//button(text(),'Find Leads')").click();
		  
		  driver.findElementByXPath("//table/tr[1]/td[1]").click();
	}

}
