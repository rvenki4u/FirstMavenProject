package week2day2homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	      driver.findElementById("username").sendKeys("DemoSalesManager");
		  driver.findElementById("password").sendKeys("crmsfa");
		  driver.findElementByClassName("decorativeSubmit").click();
		  driver.findElementByLinkText("CRM/SFA").click();
	      driver.findElementByXPath("//a[text()='Leads']").click();
	      Thread.sleep(5000);
	      //Find Leads
	      driver.findElementByXPath("//a[text()='Find Leads']").click();
	      driver.findElementByXPath("//span[text()='Phone']").click();
	      driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9865056601");
	      driver.findElementByXPath("//button[text()='Find Leads']").click();
	      Thread.sleep(5000);
	      WebElement id=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	      String leadid=id.getText();
	      System.out.println(leadid);
	      driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click(); 
	      driver.findElementByXPath("//a[text()='Delete']").click();
	      driver.findElementByXPath("//a[text()='Find Leads']").click();
	      driver.findElementByXPath("//input[@name='id']").sendKeys(leadid);
	      driver.findElementByXPath("//button[text()='Find Leads']").click(); 
	      Thread.sleep(2000);
	      WebElement error = driver.findElementByClassName("x-paging-info");
	      if(error.getText().contains("No records to display"));
	      System.out.println("Error message displayed properly");
	      driver.close();         

	}

}
