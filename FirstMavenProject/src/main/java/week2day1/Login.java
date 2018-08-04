package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		Thread.sleep(2000);
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByLinkText("Create Lead").click();
		
		/*driver.findElementById("createLeadForm_companyName").sendKeys("Rehoboth");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_firstName").sendKeys("venkat");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_lastName").sendKeys("krishnan");
		Thread.sleep(2000);
		
		driver.findElementByClassName("smallSubmit").click();*/
		//driver.findElementByLinkText("Logout").click();
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		System.out.println("size----------->"+size);
		
		dd.selectByValue("LEAD_PR");
		
		
		
		/*for(WebElement eachopt : options) {
			
			System.out.println("----------->"+eachopt.getText()); 
		}*/
		
		WebElement market = driver.findElementById("createLeadForm_marketingCampaignId");
		Select ma = new Select(market);
		List<WebElement> marketopt = ma.getOptions();
		int msize = marketopt.size();
		System.out.println("size----------->"+msize);
		ma.selectByIndex(msize-2);
		
		
		
		
	}

}
