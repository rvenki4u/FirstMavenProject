package week2day2homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditLead {

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
	      //Search for a particular lead
	      driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("sarvesh");
	      
	      driver.findElementByXPath("//button[text()='Find Leads']").click();
	      Thread.sleep(5000);
	      //Edit the lead information
	      driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
	      driver.findElementByXPath("//a[text()='Edit']").click();
	      driver.findElementById("updateLeadForm_companyName").clear();
	      driver.findElementById("updateLeadForm_companyName").sendKeys("Haniel Solutions");
	      driver.findElementByXPath("//input[@value='Update']").click();
	      
	      WebElement company = driver.findElementByXPath("//span[contains(text(),'Haniel Solutions')]");
	      String value;
	      value=company.getText();
	      if(value.contains("Haniel Solutions"))
	    	  System.out.println("Company name is updated successfully");
	      driver.close();

	}

}
