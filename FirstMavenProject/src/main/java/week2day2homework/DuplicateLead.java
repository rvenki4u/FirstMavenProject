package week2day2homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
	      
	      driver.findElementByXPath("//button[text()='Find Leads']").click();
	      Thread.sleep(5000);
	      WebElement name = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
	      String leadname=name.getText();
	      System.out.println(leadname);
	      driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").click();
	      Thread.sleep(5000);
	      driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	      String title=driver.getTitle();
	      if(title.contains("Duplicate Lead"))
	      System.out.println(title);
	      driver.findElementByXPath("//input[@value='Create Lead']").click();
	      WebElement getduplicate = driver.findElementById("viewLead_firstName_sp");
	      String Duplicate=getduplicate.getText();
	      if(leadname.contains(Duplicate))
	    	  System.out.println("The lead is duplicated successfully");
	      driver.close();
	      

	}

}
